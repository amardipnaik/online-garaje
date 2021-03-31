package com.project.bean;

public class RequestWrapper {
	
	private String latitude1;
	private String longitude1;
	private String latitude2;
	private String longitude2;
	public String getLatitude1() {
		return latitude1;
	}
	public void setLatitude1(String latitude1) {
		this.latitude1 = latitude1;
	}
	public String getLongitude1() {
		return longitude1;
	}
	public void setLongitude1(String longitude1) {
		this.longitude1 = longitude1;
	}
	public String getLatitude2() {
		return latitude2;
	}
	public void setLatitude2(String latitude2) {
		this.latitude2 = latitude2;
	}
	public String getLongitude2() {
		return longitude2;
	}
	public void setLongitude2(String longitude2) {
		this.longitude2 = longitude2;
	}
	@Override
	public String toString() {
		return "RequestWrapper [latitude1=" + latitude1 + ", longitude1=" + longitude1 + ", latitude2=" + latitude2
				+ ", longitude2=" + longitude2 + "]";
	}
	

}
