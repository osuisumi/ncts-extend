package com.haoyu.ncts.extend.lego.account.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

import com.google.common.collect.Lists;
import com.haoyu.sip.core.mapper.JsonMapper;
import com.haoyu.sip.core.service.Response;
import com.haoyu.sip.core.utils.PropertiesLoader;
import com.haoyu.sip.core.utils.ThreadContext;
import com.haoyu.sip.user.dao.IAccountDao;
import com.haoyu.sip.user.entity.Account;
import com.haoyu.sip.user.entity.UserInfo;
import com.haoyu.sip.user.service.IAccountAbstractService;
import com.haoyu.sip.user.service.IAccountService;
import com.haoyu.sip.user.service.IUserInfoService;
import com.haoyu.sip.utils.Collections3;

import net.legoteacher.m.UserInfoService;
import net.legoteacher.m.UserInfoService_Service;

public class AccountNctsAbstractServiceImpl implements IAccountAbstractService{
	
	@Resource
	private IAccountService accountService;
	@Resource
	private IUserInfoService userInfoService;
	@Resource
	private IAccountDao accountDao;
	
	public Response updatePassword(String oldPassword, String newPassword){
		String userId = ThreadContext.getUser().getId();
		if(StringUtils.isEmpty(newPassword)){
			return Response.failInstance().responseMsg("new password is empty");
		}
		Account old = accountDao.selectAccountByUserId(userId);
		if(old != null){
			if(!old.getPassword().equals(DigestUtils.md5Hex(oldPassword))){
				return Response.failInstance().responseMsg("error old password");
			}
			Account account = new Account();
			account.setId(old.getId());
			account.setPassword(newPassword);
			account.setUser(new UserInfo(userId));
			return accountService.batchResetPasswordByIds(account);
		}else{
			UserInfoService_Service ss = new UserInfoService_Service(UserInfoService_Service.WSDL_LOCATION, UserInfoService_Service.SERVICE);
	        UserInfoService port = ss.getUserInfoServicePort();  
			
			String clientId = PropertiesLoader.get("glpt.clientId");
			String clientPassword = PropertiesLoader.get("glpt.clientPassword");
			
			Response response = Response.failInstance();
			if(StringUtils.isEmpty(newPassword)){
				return response.responseMsg("new password is empty");
			}
			List<net.legoteacher.m.UserInfo> userInfos = port.readUserInfo(clientId, clientPassword, Lists.newArrayList(userId));
			if (userInfos != null && Collections3.isNotEmpty(userInfos)) {
				net.legoteacher.m.UserInfo userInfo = userInfos.get(0);
				if(!userInfo.getPassword().equals(DigestUtils.md5Hex(oldPassword))){
					return response.responseMsg("error old password");
				}
				userInfo = new net.legoteacher.m.UserInfo();
				userInfo.setId(ThreadContext.getUser().getId());
				userInfo.setPassword(DigestUtils.md5Hex(newPassword));
				String json = port.editUserInfo(clientId, clientPassword, userInfo);
				Map<String, Object> map = new JsonMapper().fromJson(json, HashMap.class);
				return Response.successInstance();
			}
			return response;
		}
	}
	
}
