package com.haoyu.ncts.extend.lego.user.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.haoyu.ncts.extend.lego.user.dao.IUserRegionsDao;
import com.haoyu.ncts.extend.lego.user.entity.UserRegions;
import com.haoyu.ncts.extend.lego.user.service.IUserRegionsService;
import com.haoyu.sip.core.service.Response;

@Service
public class UserRegionsServiceImpl implements IUserRegionsService{
	
	@Resource
	private IUserRegionsDao userRegionsDao;

	@Override
	public UserRegions getUserRegions(String userId) {
		return userRegionsDao.selectById(userId);
	}

	@Override
	public Response updateUserRegions(UserRegions userRegions) {
		int count = userRegionsDao.update(userRegions);
		return count>0?Response.successInstance():Response.failInstance();
	}

	@Override
	public Response createUserRegions(UserRegions userRegions) {
		int count = userRegionsDao.insert(userRegions);
		return count>0?Response.successInstance():Response.failInstance();
	}

}
