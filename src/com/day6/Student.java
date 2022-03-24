package com.day6;

public class Student {
	private String sName;
	private int sId;
	private String residentialStatus;
	private double feesPerMonth;
	
	
	public Student(int sId, String residentialStatus, String firstName, String lastName) {
		super();
		this.sId = sId;
		this.residentialStatus = residentialStatus;
		this.sName = firstName+" "+lastName;
	}
	@Override
	public String toString() {
		return "Student [sName=" + sName + ", sId=" + sId + ", residentialStatus=" + residentialStatus
				+ ", feesPerMonth=" + feesPerMonth + "]";
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String firstName, String lastName) {
		this.sName = firstName+" "+lastName;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getResidentialStatus() {
		return residentialStatus;
	}
	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}
	public double getFeesPerMonth() {
		return feesPerMonth;
	}
	public void setFeesPerMonth(long feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	public void CalculateFees(double semesterFees) {
		feesPerMonth = semesterFees / 6.0;
		
	}
	public void calculateFees(double semesterFees, double hostelFees) {
		feesPerMonth = semesterFees/ 6.0;
		feesPerMonth = feesPerMonth+hostelFees;
	}
	public void check() {
		
	}
	

}
