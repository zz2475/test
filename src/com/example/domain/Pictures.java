package com.example.domain;

public class Pictures {
    private int Id;
    
    private int missionNo;//任务号
    
    public String pic_name;//图片名 
    
    public String pic_url;//图片地址

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getMissionNo() {
		return missionNo;
	}

	public void setMissionNo(int missionNo) {
		this.missionNo = missionNo;
	}

	public String getPic_name() {
		return pic_name;
	}

	public void setPic_name(String pic_name) {
		this.pic_name = pic_name;
	}

	public String getPic_url() {
		return pic_url;
	}

	public void setPic_url(String pic_url) {
		this.pic_url = pic_url;
	}

	  
}
