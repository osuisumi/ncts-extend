package com.haoyu.ncts.extend.lego.user.service;

import com.haoyu.ncts.extend.lego.user.controller.param.UserInfoParam;
import com.haoyu.sip.core.service.Response;

public interface IUserLegoExtendService {

	Response saveUser(UserInfoParam userInfoParam);

}
