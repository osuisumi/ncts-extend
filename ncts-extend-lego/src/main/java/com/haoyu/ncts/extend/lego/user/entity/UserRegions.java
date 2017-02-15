package com.haoyu.ncts.extend.lego.user.entity;

import java.io.Serializable;

public class UserRegions implements Serializable{
	
	private static final long serialVersionUID = -5883744412982891600L;

	private String userId;
	
	private String province;
	
	private String city;
	
	private String counties;
	
	private String isLogined;

	public String getIsLogined() {
		return isLogined;
	}

	public void setIsLogined(String isLogined) {
		this.isLogined = isLogined;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounties() {
		return counties;
	}

	public void setCounties(String counties) {
		this.counties = counties;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}
	

}
