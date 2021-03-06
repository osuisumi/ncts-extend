package com.haoyu.ncts.extend.nea.train.dao;

import java.util.List;
import java.util.Map;

import com.haoyu.ncts.extend.nea.train.entity.TrainTerm;

public interface ITrainTermDao {

	int insert(TrainTerm trainTerm);

	List<TrainTerm> selectTrainTermCourse(Map<String, Object> param);

	TrainTerm selectOne(Map<String, Object> parameter);

	int updateByTrainId(TrainTerm trainTerm);

}
