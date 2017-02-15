package com.haoyu.ncts.extend.lego.train.entity;

import java.io.Serializable;

import com.haoyu.ncts.course.entity.Course;
import com.haoyu.tip.train.entity.Train;

public class TrainTerm implements Serializable{

	private static final long serialVersionUID = 7077998392280148941L;

	private Train train;
	
	private String termId;
	
	private Course course;

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public String getTermId() {
		return termId;
	}

	public void setTermId(String termId) {
		this.termId = termId;
	}
	
}
