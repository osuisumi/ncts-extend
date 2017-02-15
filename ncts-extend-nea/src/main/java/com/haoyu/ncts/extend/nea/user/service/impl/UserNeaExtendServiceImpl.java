package com.haoyu.ncts.extend.nea.user.service.impl;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.haoyu.ncts.course.entity.Course;
import com.haoyu.ncts.course.entity.CourseRegister;
import com.haoyu.ncts.course.service.ICourseRegisterService;
import com.haoyu.ncts.course.service.ICourseService;
import com.haoyu.ncts.course.utils.CourseRegisterState;
import com.haoyu.ncts.extend.nea.log.entity.LogInfo;
import com.haoyu.ncts.extend.nea.log.service.ILogInfoService;
import com.haoyu.ncts.extend.nea.train.dao.ITrainTermDao;
import com.haoyu.ncts.extend.nea.train.entity.TrainTerm;
import com.haoyu.ncts.extend.nea.user.service.IUserNeaExtendService;
import com.haoyu.sip.auth.realm.CacheCleaner;
import com.haoyu.sip.core.entity.Relation;
import com.haoyu.sip.core.entity.User;
import com.haoyu.sip.core.mapper.JsonMapper;
import com.haoyu.sip.core.service.Response;
import com.haoyu.sip.core.utils.PropertiesLoader;
import com.haoyu.sip.user.entity.Account;
import com.haoyu.sip.user.entity.Department;
import com.haoyu.sip.user.entity.UserInfo;
import com.haoyu.sip.user.service.IAccountService;
import com.haoyu.sip.user.service.IDepartmentService;
import com.haoyu.sip.user.service.IUserInfoService;
import com.haoyu.sip.utils.Collections3;
import com.haoyu.sip.utils.TimeUtils;
import com.haoyu.tip.train.entity.Train;
import com.haoyu.tip.train.entity.TrainRegister;
import com.haoyu.tip.train.service.ITrainRegisterService;
import com.haoyu.tip.train.service.ITrainService;
import com.haoyu.tip.train.utils.TrainRegisterState;

import cn.com.gdjxjy.glpt.UserInfoServiceProxy;
import cn.gdjsw.m.PinfoTermProxy;

@Service
public class UserNeaExtendServiceImpl implements IUserNeaExtendService{
	
	@Resource
	private CacheCleaner authRealm;
	@Resource
	private IUserInfoService userInfoService;
	@Resource
	private IAccountService accountService;
	@Resource
	private IDepartmentService departmentService;
	@Resource
	private ICourseRegisterService courseRegisterService;
	@Resource
	private ITrainTermDao trainTermDao;
	@Resource
	private ITrainRegisterService trainRegisterService;
	@Resource
	private ITrainService trainService;
	@Resource
	private UserInfoServiceProxy userInfoServiceProxy;
	@Resource
	private PinfoTermProxy pinfoTermProxy;
	@Resource
	private ApplicationContext applicationContext;
	@Resource
	private ILogInfoService logInfoService;
	@Resource
	private ICourseService courseService;


	@Override
	public Response saveUser(Account account) {
		account.setRoleCode("2");
		if (account.getUser().getDepartment() != null && StringUtils.isNotEmpty(account.getUser().getDepartment().getDeptName())) {
			Department dept = new Department();
			dept.setDeptName(account.getUser().getDepartment().getDeptName());
			List<Department> departments = departmentService.list(dept, null);
			if (Collections3.isNotEmpty(departments)) {
				account.getUser().setDepartment(departments.get(0));
			}
		}
		Response response = accountService.createAccount(account);
		if (response.isSuccess()) {
			response = this.ayncCreateCourseRegister(account.getUser());
		}
		return response;
	}

	/**
	 * 此方法用来同步提升工程的报名与选课
	 */
	@Override
	public Response ayncCreateCourseRegister(UserInfo userInfo) {
		String userId = userInfo.getId();
		LogInfo logInfo = new LogInfo();
		logInfo.setUserId(userId);
		StringBuffer sb = new StringBuffer();
		String systemId = PropertiesLoader.get("gdjsw.systemId");
		String systemPassword = PropertiesLoader.get("gdjsw.systemPassword");
		String json = null;
		//查询公服的选课列表
		try {
			json = pinfoTermProxy.listPinfoTermUser(systemId, systemPassword, null, userId, 1, 1000);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		Map<String, Object> map = new JsonMapper().fromJson(json, HashMap.class);
		List<Map<String, Object>> termUsers = (List<Map<String, Object>>) map.get("termUserList");
		if (termUsers == null) {
			termUsers = Lists.newArrayList();
		}
		
		//得到公服的期次ID
		String termId = null;
		if (Collections3.isNotEmpty(termUsers)) {
			termId = (String) termUsers.get(0).get("termId");
		}else{
			//如果没有期ID, 则返回提示页面, 提示该用户没有报名
			return Response.failInstance().responseMsg("not sign up");
//			Map<String, Object> queryParam = Maps.newHashMap();
//			queryParam.put("msg", "not sign up");
//			WebUtils.issueRedirect(request, response, "/nea/user/tip", queryParam);
//			return false;
		}
		
		//查询与该期次关联的培训
		Map<String, Object> ttParam = Maps.newHashMap();
		ttParam.put("termId", termId);
		List<TrainTerm> trainTerms = trainTermDao.selectTrainTermCourse(ttParam);
		if (Collections3.isEmpty(trainTerms)) {
			//如果没有关联, 则返回提示页面, 提示该培训还未开启, 并插入日志以提醒教务
			sb.append("没有关联期次,");
			logInfo.setInfo(sb.toString());
			logInfoService.createLogInfo(logInfo);
			return Response.failInstance().responseMsg("train is not started");
//			Map<String, Object> queryParam = Maps.newHashMap();
//			queryParam.put("msg", "train is not started");
//			WebUtils.issueRedirect(request, response, "/nea/user/tip", queryParam);
//			return false;
		}
		
		//得到培训ID
		String trainId = null;
		List<String> codes = Lists.newArrayList();
		for (TrainTerm trainTerm : trainTerms) {
			if (StringUtils.isEmpty(trainId)) {
				trainId = trainTerm.getTrain().getId();
			}
			codes.add(trainTerm.getCourse().getCode());
		}
		
		//判断所选课程是否关联
		List<String> existsCodes = Lists.newArrayList();
		for (Map<String, Object> termUser : termUsers) {
			String courseCode = (String)termUser.get("courseId");
			courseCode = StringUtils.substringAfterLast(courseCode, "GDES_");
			if (!codes.contains(courseCode)) {
				//提醒教务
				sb.append("此课程没有配置："+courseCode+",");
			}else{
				existsCodes.add(courseCode);
			}
		}
		Map<String, Object> trParam = Maps.newHashMap();
		trParam.put("userId", userId);
		trParam.put("trainId", trainId);
		List<TrainRegister> trainRegisters = trainRegisterService.findTrainRegisters(trParam);
		if (Collections3.isEmpty(trainRegisters)) {
			//插入培训报名
			TrainRegister trainRegister = new TrainRegister();
			trainRegister.setTrain(new Train(trainId));
			trainRegister.setUser(new User(userId));
			trainRegister.setState(TrainRegisterState.PASS);
			trainRegisterService.createTrainRegister(trainRegister);
			sb.append("创建报名");
		}
		Map<String, Object> crParam = Maps.newHashMap();
		crParam.put("userId", userId);
		crParam.put("relationId", trainId);
		crParam.put("selectType", "hasCourseRegisterOfBranch");
		List<Course> courses = courseService.listCourseBySource(crParam, null);
		Map<String, Course> courseMap = (Map<String, Course>) Collections3.extractToMap(courses, "code", null);
		for (String courseCode : existsCodes) {
			if (!courseMap.containsKey(courseCode)) {
				//插入选课
				crParam = Maps.newHashMap();
				crParam.put("parentcode", courseCode);
				crParam.put("relationId", trainId);
				crParam.put("selectType", "brachCourse");
				List<Course> cs = courseService.listCourseBySource(crParam, null);
				if (Collections3.isNotEmpty(cs)) {
					Course course = cs.get(0);
					CourseRegister courseRegister = new CourseRegister();
					courseRegister.setCourse(course);
					courseRegister.setUser(new User(userId));
					courseRegister.setRelation(new Relation(trainId));
					courseRegister.setState(CourseRegisterState.PASS);
					courseRegisterService.createCourseRegister(courseRegister);
					sb.append("创建选课");
				}
			}
		}
		for (Course course : courses) {
			if (!existsCodes.contains(course.getCode())) {
				//删除选课
				crParam = Maps.newHashMap();
				crParam.put("parentcode", course.getCode());
				crParam.put("relationId", trainId);
				crParam.put("selectType", "brachCourse");
				List<Course> cs = courseService.listCourseBySource(crParam, null);
				if (Collections3.isNotEmpty(cs)) {
					Course c = cs.get(0);
					Map<String, Object> deleteParam = Maps.newHashMap();
					deleteParam.put("userId", userId);
					deleteParam.put("courseId", c.getId());
					courseRegisterService.deleteCourseRegisterByParam(deleteParam);
					sb.append("删除选课");
				}
			}
		}
		logInfo.setInfo(sb.toString());
		logInfoService.createLogInfo(logInfo);
		Train train = trainService.findTrainById(trainId);
		if (TimeUtils.hasBegun(train.getTrainingTime().getStartTime())) {
			return Response.successInstance();
		}else{
			return Response.failInstance().responseMsg("train is not started").responseData(train.getTrainingTime().getStartTime());
//			Map<String, Object> queryParam = Maps.newHashMap();
//			queryParam.put("msg", "train is not started");
//			queryParam.put("data", train.getTrainingTime().getStartTime());
//			WebUtils.issueRedirect(request, response, "/nea/user/tip", queryParam);
//			return false;
		}
	}
	
	

}
