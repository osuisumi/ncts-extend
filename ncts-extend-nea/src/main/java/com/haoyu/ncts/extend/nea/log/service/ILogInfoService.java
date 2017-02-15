package com.haoyu.ncts.extend.nea.log.service;

import com.haoyu.ncts.extend.nea.log.entity.LogInfo;
import com.haoyu.sip.core.service.Response;

public interface ILogInfoService {

	Response createLogInfo(LogInfo logInfo);
}
