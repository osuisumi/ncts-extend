package com.haoyu.ncts.extend.lego.user.controller.param;

import java.io.Serializable;

import com.haoyu.ncts.extend.lego.user.entity.UserRegions;
import com.haoyu.sip.user.entity.UserInfo;

public class UserInfoParam extends UserInfo implements Serializable{
	
	private static final long serialVersionUID = -6389012821752335205L;

	private UserRegions userRegions;

	public UserRegions getUserRegions() {
		return userRegions;
	}

	public void setUserRegions(UserRegions userRegions) {
		this.userRegions = userRegions;
	}

}
