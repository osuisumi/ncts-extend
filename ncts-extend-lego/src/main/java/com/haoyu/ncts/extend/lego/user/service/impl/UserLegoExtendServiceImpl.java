package com.haoyu.ncts.extend.lego.user.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.google.common.collect.Maps;
import com.haoyu.ncts.course.entity.Course;
import com.haoyu.ncts.course.entity.CourseRegister;
import com.haoyu.ncts.course.entity.CourseRelation;
import com.haoyu.ncts.course.service.ICourseRegisterService;
import com.haoyu.ncts.course.service.ICourseRelationService;
import com.haoyu.ncts.course.utils.CourseRegisterState;
import com.haoyu.ncts.extend.lego.user.controller.param.UserInfoParam;
import com.haoyu.ncts.extend.lego.user.entity.UserRegions;
import com.haoyu.ncts.extend.lego.user.service.IUserLegoExtendService;
import com.haoyu.ncts.extend.lego.user.service.IUserRegionsService;
import com.haoyu.sip.core.entity.Relation;
import com.haoyu.sip.core.entity.User;
import com.haoyu.sip.core.service.Response;
import com.haoyu.sip.core.utils.ThreadContext;
import com.haoyu.sip.user.entity.Department;
import com.haoyu.sip.user.entity.UserInfo;
import com.haoyu.sip.user.service.IDepartmentService;
import com.haoyu.sip.user.service.IUserInfoService;
import com.haoyu.sip.utils.Collections3;
import com.haoyu.tip.train.entity.TrainRegister;
import com.haoyu.tip.train.service.ITrainRegisterService;

@Service
public class UserLegoExtendServiceImpl implements IUserLegoExtendService{
	
	@Resource
	private IUserRegionsService userRegionsService;
	@Resource
	private IDepartmentService departmentService;
	@Resource
	private IUserInfoService userInfoService;
	@Resource
	private ITrainRegisterService trainRegisterService;
	@Resource
	private ICourseRelationService courseRelationService;
	@Resource
	private ICourseRegisterService courseRegisterService;

	@Override
	public Response saveUser(UserInfoParam userInfoParam) {
		UserRegions userRegions = userInfoParam.getUserRegions();
		UserInfo userInfo = userInfoParam;
		String userId = ThreadContext.getUser().getId();
		if (userRegions != null) {
			userRegions.setUserId(userId);
			userRegions.setIsLogined("Y");
			Response response = userRegionsService.updateUserRegions(userRegions);
			if (!response.isSuccess()) {
				userRegionsService.createUserRegions(userRegions);
			}
		}
		if (userInfo.getDepartment() != null && StringUtils.isNotEmpty(userInfo.getDepartment().getDeptName())) {
			Map<String, Object> param = Maps.newHashMap();
			param.put("deptNameEquals", userInfo.getDepartment().getDeptName());
			List<Department> departments = departmentService.list(param, null);
			if (Collections3.isNotEmpty(departments)) {
				userInfo.getDepartment().setId(departments.get(0).getId());
			}else{
				userInfo.getDepartment().setId(DigestUtils.md5Hex(userInfo.getDepartment().getDeptName()));
				userInfo.getDepartment().setDefaultValue();
				departmentService.createDepartment(userInfo.getDepartment());
			}
		}
		userInfo.setId(userId);
		Response response = userInfoService.updateUser(userInfo);
		if (response.isSuccess() && StringUtils.isNotEmpty(userInfo.getStage())) {
			Map<String, Object> parameter = Maps.newHashMap();
			parameter.put("userId", userId);
			List<TrainRegister> trainRegisters = trainRegisterService.findTrainRegisters(parameter);
			if (Collections3.isNotEmpty(trainRegisters)) {
				for (TrainRegister trainRegister : trainRegisters) {
					String trainId = trainRegister.getTrain().getId();
					parameter = Maps.newHashMap();
					parameter.put("relationId", trainId);
					parameter.put("stage", userInfo.getStage());
					List<CourseRelation> courseRelations = courseRelationService.listCourseRelations(parameter, null);
					if (Collections3.isNotEmpty(courseRelations)) {
						parameter = Maps.newHashMap();
						parameter.put("relationId", trainId);
						parameter.put("userId", userId);
						List<CourseRegister> courseRegisters = courseRegisterService.listCourseRegister(parameter, null);
						List<Course> existsCourses = Collections3.extractToList(courseRegisters, "course");
						List<String> existsCourseIds = Collections3.extractToList(existsCourses, "id");
						for (CourseRelation courseRelation : courseRelations) {
							String courseId = courseRelation.getCourse().getId();
							if (!existsCourseIds.contains(courseId)) {
								CourseRegister courseRegister = new CourseRegister();
								courseRegister.setCourse(courseRelation.getCourse());
								courseRegister.setRelation(new Relation(trainId));
								courseRegister.setUser(new User(userId));
								courseRegister.setState(CourseRegisterState.PASS);
								courseRegisterService.createCourseRegister(courseRegister);
							}
						}
					}
				}
			}
		}
		return response;
	}

}
