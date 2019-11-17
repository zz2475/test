package com.example.domain;

import java.sql.Date;
/**
 * 
 * @author XRDMM
 *
 */
public class Mission {

	private int missionNo;//任务号
	
	private String uName;//用户名
	
	private String missionrDetail;//订单详情	
	
	private MissionType missionType;//订单类型
	
	private Date startTime;//开始时间
	
	private Date endTime;//结束时间
	
	private MissionStatus missionStatus;//̬发布者订单状态

	public int getMissionNo() {
		return missionNo;
	}

	public void setMissionNo(int missionNo) {
		this.missionNo = missionNo;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getMissionrDetail() {
		return missionrDetail;
	}

	public void setMissionrDetail(String missionrDetail) {
		this.missionrDetail = missionrDetail;
	}

	public MissionType getMissionType() {
		return missionType;
	}

	public void setMissionType(MissionType missionType) {
		this.missionType = missionType;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public MissionStatus getMissionStatus() {
		return missionStatus;
	}

	public void setMissionStatus(MissionStatus missionStatus) {
		this.missionStatus = missionStatus;
	}

	
	
	
}
