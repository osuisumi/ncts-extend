package com.haoyu.ncts.extend.nea.train.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.haoyu.ncts.extend.nea.train.dao.ITrainTermDao;
import com.haoyu.ncts.extend.nea.train.entity.TrainTerm;
import com.haoyu.ncts.extend.nea.train.service.ITrainTermService;
import com.haoyu.sip.core.service.Response;
import com.haoyu.tip.train.service.ITrainService;

@Service("trainTermNeaService")
public class TrainTermServiceImpl implements ITrainTermService{
	
	@Resource
	private ITrainTermDao trainTermNeaDao;
	@Resource
	private ITrainService trainService;

	@Override
	public TrainTerm getTrainTerm(Map<String, Object> parameter) {
		return trainTermNeaDao.selectOne(parameter);
	}
	
	@Override
	public Response createTrain(TrainTerm trainTerm) {
		Response response = trainService.createTrain(trainTerm.getTrain());
		if (response.isSuccess()) {
			if (StringUtils.isNotEmpty(trainTerm.getTermId())) {
				int count = trainTermNeaDao.insert(trainTerm);
				return count>0?Response.successInstance():Response.failInstance();
			}
		}
		return response;
	}

	@Override
	public Response updateTrain(TrainTerm trainTerm) {
		if (StringUtils.isNotEmpty(trainTerm.getTermId())) {
			int count = trainTermNeaDao.updateByTrainId(trainTerm);
			if (count <= 0) {
				trainTermNeaDao.insert(trainTerm);
			}
		}
		return trainService.updateTrain(trainTerm.getTrain());
	}

}
