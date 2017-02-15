package com.haoyu.ncts.extend.nea.log.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.haoyu.ncts.extend.nea.log.dao.ILogInfoDao;
import com.haoyu.ncts.extend.nea.log.entity.LogInfo;
import com.haoyu.ncts.extend.nea.log.service.ILogInfoService;
import com.haoyu.sip.core.service.Response;
import com.haoyu.sip.utils.Identities;

@Service
public class LogInfoServiceImpl implements ILogInfoService{
	
	@Resource
	private ILogInfoDao logInfoDao;

	@Override
	public Response createLogInfo(LogInfo logInfo) {
		if (StringUtils.isEmpty(logInfo.getId())) {
			logInfo.setId(Identities.uuid2());
		}
		logInfo.setCreateTime(new Date());
		int count = logInfoDao.insert(logInfo);
		return count>0?Response.successInstance():Response.failInstance();
	}

}
