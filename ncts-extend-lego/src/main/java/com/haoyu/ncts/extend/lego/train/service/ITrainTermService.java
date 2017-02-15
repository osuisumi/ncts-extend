package com.haoyu.ncts.extend.lego.train.service;

import java.util.Map;

import com.haoyu.ncts.extend.lego.train.entity.TrainTerm;
import com.haoyu.sip.core.service.Response;

public interface ITrainTermService {

	TrainTerm getTrainTerm(Map<String, Object> parameter);

	Response createTrain(TrainTerm trainTerm);

	Response updateTrain(TrainTerm trainTerm);

}
