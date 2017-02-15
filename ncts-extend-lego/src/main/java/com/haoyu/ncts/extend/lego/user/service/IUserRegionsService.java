package com.haoyu.ncts.extend.lego.user.service;

import com.haoyu.ncts.extend.lego.user.entity.UserRegions;
import com.haoyu.sip.core.service.Response;

public interface IUserRegionsService {

	UserRegions getUserRegions(String userId);

	Response updateUserRegions(UserRegions userRegions);

	Response createUserRegions(UserRegions userRegions);

}
