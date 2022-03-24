package com.day7;

public class DayScholar extends Student {
	private String residentialAdd;

	public DayScholar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DayScholar(int sId, String residentialStatus, String firstName, String lastName, String residentialAdd) {
		//super(sId, residentialStatus, firstName, lastName);
		// TODO Auto-generated constructor stub
		this.sId = sId;
		this.sName = firstName+" "+lastName;
		this.residentialStatus = residentialStatus;
		this.residentialAdd = residentialAdd;
	}

	public String getResidentialAdd() {
		return residentialAdd;
	}

	public void setResidentialAdd(String residentialAdd) {
		this.residentialAdd = residentialAdd;
	}

	public DayScholar(String residentialAdd) {
		super();
		this.residentialAdd = residentialAdd;
	}

	@Override
	public String toString() {
		return "DayScholar [residentialAdd=" + residentialAdd + ", sName=" + sName + ", sId=" + sId
				+ ", residentialStatus=" + residentialStatus + ", feesPerMonth=" + feesPerMonth + "]";
	}
	
	
	

}
