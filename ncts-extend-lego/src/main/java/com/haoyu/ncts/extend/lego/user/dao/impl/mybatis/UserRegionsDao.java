package com.haoyu.ncts.extend.lego.user.dao.impl.mybatis;

import org.springframework.stereotype.Repository;

import com.haoyu.ncts.extend.lego.user.dao.IUserRegionsDao;
import com.haoyu.ncts.extend.lego.user.entity.UserRegions;
import com.haoyu.sip.core.jdbc.MybatisDao;

@Repository
public class UserRegionsDao extends MybatisDao implements IUserRegionsDao{

	@Override
	public UserRegions selectById(String userId) {
		return super.selectByPrimaryKey(userId);
	}

	@Override
	public int update(UserRegions userRegions) {
		return super.update(userRegions);
	}

	@Override
	public int insert(UserRegions userRegions) {
		return super.insert(userRegions);
	}

}
