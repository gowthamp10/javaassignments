package com.day8;

public class DayScholar extends Student{
	private String residentialAdd;
	public DayScholar(int sId, String sName, char sType, int semFee, int feePerMonth, String residentialAdd) {
		super(sId, sName, sType, semFee, feePerMonth);
		this.residentialAdd = residentialAdd;
	}
	void displayDetails() {
		super.displayDetails();
		System.out.println("Residential Address:\t"+this.residentialAdd);
		
	}
	
	
	

}
