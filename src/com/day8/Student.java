package com.day8;

public class Student {
	protected int sId;
	protected String sName;
	protected char sType;
	protected int semFee;
	protected int feePerMonth;
	
	public Student(int sId) {
		super();
		this.sId = sId;
	}

	public Student(int sId, String sName, char sType, int semFee, int feePerMonth) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sType = sType;
		this.semFee = semFee;
		this.feePerMonth = feePerMonth;
	}
	
	void displayDetails() {
		System.out.println("Student Details:\n");
		System.out.println("Student Name:\t"+this.sName);
		System.out.println("Student Id:\t"+this.sId);
		System.out.println("Student Type:\t"+this.sType);
		System.out.println("Student FeePerMonth:\t"+this.feePerMonth);
		System.out.println("Student Sem Fee:\t"+this.semFee);
		
	}
	

}


