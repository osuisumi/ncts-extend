package com.haoyu.ncts.extend.nea.user.service;

import com.haoyu.sip.core.service.Response;
import com.haoyu.sip.user.entity.Account;
import com.haoyu.sip.user.entity.UserInfo;

public interface IUserNeaExtendService {

	Response saveUser(Account account);

	Response ayncCreateCourseRegister(UserInfo userInfo);
}
