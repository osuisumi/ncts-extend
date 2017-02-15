package com.haoyu.ncts.extend.nea.train.dao.impl.mybatis;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.haoyu.ncts.extend.nea.train.dao.ITrainTermDao;
import com.haoyu.ncts.extend.nea.train.entity.TrainTerm;
import com.haoyu.sip.core.jdbc.MybatisDao;

@Repository("trainTermNeaDao")
public class TrainTermDao extends MybatisDao implements ITrainTermDao{

	@Override
	public int insert(TrainTerm trainTerm) {
		return super.insert(trainTerm);
	}

	@Override
	public List<TrainTerm> selectTrainTermCourse(Map<String, Object> param) {
		return super.selectList("selectTrainTermCourse", param);
	}

	@Override
	public TrainTerm selectOne(Map<String, Object> parameter) {
		return super.selectOne("selectOne", parameter);
	}

	@Override
	public int updateByTrainId(TrainTerm trainTerm) {
		return super.update(trainTerm);
	}

}
