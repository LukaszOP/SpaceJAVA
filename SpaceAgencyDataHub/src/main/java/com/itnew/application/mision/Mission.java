package com.itnew.application.mision;

import java.util.Date;

import com.itnew.application.ImageryType;

/**
 * @author Lukasz Nowicki
 *
 */
public class Mission {

	private String missionName;
	private ImageryType imageryType;
	private Date misionStartDate;
	private Date misionFinishDate;	
	
	public Mission() {
		super();
	}
	
	public Mission(String missionName, ImageryType imageryType, Date misionStartDate, Date misionFinishDate) {
		super();
		this.missionName = missionName;
		this.imageryType = imageryType;
		this.misionStartDate = misionStartDate;
		this.misionFinishDate = misionFinishDate;
	}
	
	public String getMissionName() {
		return missionName;
	}
	public void setMissionName(String missionName) {
		this.missionName = missionName;
	}
	public ImageryType getImageryType() {
		return imageryType;
	}
	public void setImageryType(ImageryType imageryType) {
		this.imageryType = imageryType;
	}
	public Date getMisionStartDate() {
		return misionStartDate;
	}
	public void setMisionStartDate(Date misionStartDate) {
		this.misionStartDate = misionStartDate;
	}
	public Date getMisionFinishDate() {
		return misionFinishDate;
	}
	public void setMisionFinishDate(Date misionFinishDate) {
		this.misionFinishDate = misionFinishDate;
	}
}
