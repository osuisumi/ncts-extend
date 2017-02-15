package com.haoyu.ncts.extend.nea.user.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.common.collect.Lists;
import com.haoyu.ncts.extend.nea.event.LoginSuccessEvent;
import com.haoyu.ncts.extend.nea.shiro.entity.ShiroUser;
import com.haoyu.ncts.extend.nea.user.service.IUserNeaExtendService;
import com.haoyu.sip.auth.realm.CacheCleaner;
import com.haoyu.sip.core.service.Response;
import com.haoyu.sip.core.web.AbstractBaseController;
import com.haoyu.sip.login.Loginer;
import com.haoyu.sip.user.entity.Account;
import com.haoyu.sip.user.entity.UserInfo;
import com.haoyu.sip.user.service.IUserInfoService;

@Controller
@RequestMapping("**/nea/user")
public class UserNeaExtendController extends AbstractBaseController{
	
	@Resource
	private IUserNeaExtendService userNeaExtendService;
	@Resource
	private IUserInfoService userInfoService;
	@Resource
	private ApplicationContext applicationContext;
	@Resource
	private CacheCleaner authRealm;
	
	@RequestMapping("edit_user")
	public String editUser(Model model){
		org.apache.shiro.subject.Subject currentUser = SecurityUtils.getSubject();
		PrincipalCollection principals = currentUser.getPrincipals();
		List<Object> listPrincipals = principals.asList();
		Map<String, String> attributes = (Map<String, String>) listPrincipals.get(1);
		String userId = attributes.get("id");
		String realName = attributes.get("realName");
		String paperworkNo = attributes.get("paperworkNo");
		String avatar = attributes.get("avatar");
		String deptName = attributes.get("deptName");
		String mobilePhone = attributes.get("mobilePhone");
		model.addAttribute("mobilePhone", mobilePhone);
		model.addAttribute("userId", userId);
		model.addAttribute("deptName", deptName);
		model.addAttribute("realName", realName);
		model.addAttribute("paperworkNo", paperworkNo);
		return "/ncts/nea/common/edit_user";
	}
	
	@RequestMapping("tip")
	public String tip(Model model){
		super.setParameterToModel(request, model);
		return "/ncts/nea/common/tip";
	}
	
	@RequestMapping("save_user")
	public String save_user(Account account, Model model){
		Response response = userNeaExtendService.saveUser(account);
		UserInfo userInfo = userInfoService.selectUserInfoFromBaseUserView(account.getUser().getId());
		if (userInfo != null) {
			UsernamePasswordToken upt = new UsernamePasswordToken();
			upt.setUsername(userInfo.getUserName());
			ShiroUser shiroUser = new ShiroUser();
			shiroUser.setId(userInfo.getId());
			shiroUser.setUserName(userInfo.getUserName());
			shiroUser.setRealName(userInfo.getRealName());
			shiroUser.setDeptId(userInfo.getDepartment().getId());
			shiroUser.setAvatar(userInfo.getAvatar());
			shiroUser.setDeptName(userInfo.getDepartment().getDeptName());
			shiroUser.setAttributes(new HashMap<String,Object>());
			shiroUser.getAttributes().put("deptId", shiroUser.getDeptId());
			shiroUser.getAttributes().put("avatar", shiroUser.getAvatar());
			shiroUser.getAttributes().put("deptName", shiroUser.getDeptName());
			((HttpServletRequest)request).getSession().setAttribute("loginer", (Loginer)shiroUser);
			authRealm.clearUserCacheByIds(Lists.newArrayList(shiroUser.getId()));
			applicationContext.publishEvent(new LoginSuccessEvent(new Object()));
		}
		if (response.isSuccess()) {
			return "/";
		}else{
			model.addAttribute("param_msg", response.getResponseMsg());
			model.addAttribute("param_data", response.getResponseData());
			return "/ncts/nea/common/tip";
		}
	}
	
}
