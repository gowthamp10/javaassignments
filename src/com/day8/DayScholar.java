package com.day8;

public class DayScholar extends Student{
	private String residentialAdd;
	public DayScholar(int sId, String sName, char sType, int semFee, int feePerMonth,String cName, String residentialAdd) {
		super(sId, sName, sType, semFee, feePerMonth, cName);
		this.residentialAdd = residentialAdd;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Residential Address:\t"+this.residentialAdd);
		
	}
	
	
	

}
