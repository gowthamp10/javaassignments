package com.day5;

public class Student {
	private int sId;
	private String firstName;
	private String lastName;
	private String sType;
	private String sName;
	public Student(int sId, String firstName, String lastName, String sType) {
		super();
		this.sId = sId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.setSudentName(firstName, lastName);
		this.sType = sType;
	}
	
	public void setSudentName(String firstName,String lastName) {
		sName = firstName+" "+lastName;
		
	}
	
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sType=" + sType + ", sName=" + sName + "]";
	}

	public static void main(String[] args) {
		Student st = new Student(10, "Gowtham", "P", "Fresher");
		System.out.println(st);
		
	}

}
