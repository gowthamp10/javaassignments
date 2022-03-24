package com.day3;

public class Student {

	private int sId;
	private char sType;
	private String sName;
	public Student(int sId, char sType, String sName) {
		super();
		this.sId = sId;
		this.sType = sType;
		this.sName = sName;
	}
	public Student() {
		System.out.println("Defalut constructor");
	}
	public void displayDetails() {
		System.out.println("Student Id\t:"+sId);
		System.out.println("Student Nmae\t:"+sName);
		System.out.println("Student Type\t:"+sType);
	}
	public static void main(String[] args) {
		Student st = new Student(550, 'H',"Gowtham");
		st.displayDetails();
	}

}
