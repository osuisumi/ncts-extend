package com.haoyu.ncts.extend.nea.filter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.cas.CasFilter;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.context.ApplicationContext;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.haoyu.ncts.extend.nea.event.LoginSuccessEvent;
import com.haoyu.ncts.extend.nea.shiro.entity.ShiroUser;
import com.haoyu.ncts.extend.nea.user.service.IUserNeaExtendService;
import com.haoyu.sip.auth.realm.CacheCleaner;
import com.haoyu.sip.core.service.Response;
import com.haoyu.sip.login.Loginer;
import com.haoyu.sip.user.entity.UserInfo;
import com.haoyu.sip.user.service.IUserInfoService;
import com.haoyu.sip.utils.Collections3;

public class AuthenticationCasFilter extends CasFilter {	
	
	@Resource
	private CacheCleaner authRealm;
	@Resource
	private IUserInfoService userInfoService;
	@Resource
	private ApplicationContext applicationContext;
	@Resource
	private IUserNeaExtendService userNeaExtendService;

	@Override
	protected boolean onLoginSuccess(AuthenticationToken token, Subject subject, ServletRequest request, ServletResponse response) throws Exception {
		PrincipalCollection principals = subject.getPrincipals();
		List<Object> listPrincipals = principals.asList();
		Map<String, String> attributes = (Map<String, String>) listPrincipals.get(1);
		
		String from = attributes.get("from");
		String userId = attributes.get("id");
		String userName = attributes.get("userName");
		String realName = attributes.get("realName");
		String password = attributes.get("password");
		String paperworkNo = attributes.get("paperworkNo");
		String deptId = attributes.get("deptId");
		String avatar = attributes.get("avatar");
		String deptName = attributes.get("deptName");
		String mobilePhone = attributes.get("mobilePhone");
//		from = "info";
//		paperworkNo = "10012310012341";
//		userName = "Ssb";
//		mobilePhone = "Ssb1";
		if ("info".equals(from)) {
			Map<String, Object> parameter = Maps.newHashMap();
			parameter.put("paperworkNo", paperworkNo);
			List<UserInfo> userInfos = userInfoService.selectUserInfoFromBaseUserView(parameter, null);
			if (Collections3.isEmpty(userInfos)) {
				WebUtils.issueRedirect(request, response, "/nea/user/edit_user");
				return false;
			}
			UserInfo userInfo = userInfos.get(0);
			userId = userInfo.getId();
			Response rep = userNeaExtendService.ayncCreateCourseRegister(userInfo);
			if (!rep.isSuccess()) {
				Map<String, Object> queryParam = Maps.newHashMap();
				queryParam.put("msg", rep.getResponseMsg());
				queryParam.put("data", rep.getResponseData());
				WebUtils.issueRedirect(request, response, "/nea/user/tip", queryParam);
				return false;
			}
		}
		
		UsernamePasswordToken upt = new UsernamePasswordToken();
		upt.setUsername(userName);
		ShiroUser shiroUser = new ShiroUser();
		shiroUser.setId(userId);
		shiroUser.setUserName(userName);
		shiroUser.setRealName(realName);
		shiroUser.setDeptId(deptId);
		shiroUser.setAvatar(avatar);
		shiroUser.setDeptName(deptName);
		shiroUser.setAttributes(new HashMap<String,Object>());
		shiroUser.getAttributes().put("deptId", shiroUser.getDeptId());
		shiroUser.getAttributes().put("avatar", shiroUser.getAvatar());
		shiroUser.getAttributes().put("deptName", shiroUser.getDeptName());
		((HttpServletRequest)request).getSession().setAttribute("loginer", (Loginer)shiroUser);
		authRealm.clearUserCacheByIds(Lists.newArrayList(shiroUser.getId()));
		applicationContext.publishEvent(new LoginSuccessEvent(new Object()));
		return super.onLoginSuccess(token, subject, request, response);
	}
	
	
}
