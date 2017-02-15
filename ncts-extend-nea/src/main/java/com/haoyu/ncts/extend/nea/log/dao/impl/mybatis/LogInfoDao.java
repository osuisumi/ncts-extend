package com.haoyu.ncts.extend.nea.log.dao.impl.mybatis;

import org.springframework.stereotype.Repository;

import com.haoyu.ncts.extend.nea.log.dao.ILogInfoDao;
import com.haoyu.ncts.extend.nea.log.entity.LogInfo;
import com.haoyu.sip.core.jdbc.MybatisDao;

@Repository
public class LogInfoDao extends MybatisDao implements ILogInfoDao{

	@Override
	public int insert(LogInfo logInfo) {
		return super.insert(logInfo);
	}

}
