package com.haoyu.ncts.extend.nea.log.entity;

import java.io.Serializable;
import java.util.Date;

public class LogInfo implements Serializable{
	
	private static final long serialVersionUID = -5284294117757099904L;

	private String id;
	
	private String info;
	
	private String userId;
	
	private Date createTime;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
