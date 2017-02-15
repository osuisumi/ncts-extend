package com.haoyu.ncts.extend.lego.user.controller;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.haoyu.ncts.extend.lego.user.controller.param.UserInfoParam;
import com.haoyu.ncts.extend.lego.user.service.IUserLegoExtendService;
import com.haoyu.sip.core.service.Response;
import com.haoyu.sip.core.web.AbstractBaseController;
import com.haoyu.sip.login.Loginer;

@Controller
@RequestMapping("**/lego/user")
public class UserLegoExtendController extends AbstractBaseController{
	
	@Resource
	private IUserLegoExtendService userLegoExtendService;
	
	@RequestMapping("edit_user")
	public String editUser(Model model){
		return "/user-center/lego/edit_user";
	}
	
	@RequestMapping(value="save_user", method=RequestMethod.PUT)
	@ResponseBody
	public Response save_user(UserInfoParam userInfoParam){
		Response response = userLegoExtendService.saveUser(userInfoParam);
		if (response.isSuccess()) {
			Loginer shiroUser = (Loginer) request.getSession().getAttribute("loginer");
			if (StringUtils.isNotEmpty(userInfoParam.getRealName())) {
				shiroUser.setRealName(userInfoParam.getRealName());
			}
		}
		return response;
	}
	
}
