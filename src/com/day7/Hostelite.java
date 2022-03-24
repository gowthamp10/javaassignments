package com.day7;

public class Hostelite extends Student{
	private String hostelName;
	private int roomNo;
	
	
	public Hostelite(int sId, String residentialStatus, String firstName, String lastName, String hostelName, int roomNo) {
		//super(sId, residentialStatus, firstName, lastName);
		// TODO Auto-generated constructor stub
		this.sId = sId;
		this.sName = firstName+" "+lastName;
		this.residentialStatus = residentialStatus;
		
		this.hostelName = hostelName;
		this.roomNo = roomNo;
	}
	
	/*@Override
	public String toString() {
		return "Hostelite [hostelName=" + hostelName + ", roomNo=" + roomNo + ", toString()=" + super.toString()
				+ ", getsName()=" + getsName() + ", getsId()=" + getsId() + ", getResidentialStatus()="
				+ getResidentialStatus() + ", getFeesPerMonth()=" + getFeesPerMonth() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}*/

	public Hostelite() {
		
	}
	@Override
	public String toString() {
		return "Hostelite [hostelName=" + hostelName + ", roomNo=" + roomNo + ", sName=" + sName + ", sId=" + sId
				+ ", residentialStatus=" + residentialStatus + ", feesPerMonth=" + feesPerMonth + "]";
	}

	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	
	
	

}
