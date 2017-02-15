package com.haoyu.ncts.extend.lego.user.dao;

import com.haoyu.ncts.extend.lego.user.entity.UserRegions;

public interface IUserRegionsDao {

	UserRegions selectById(String userId);

	int update(UserRegions userRegions);

	int insert(UserRegions userRegions);

}
