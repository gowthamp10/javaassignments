package com.day1;

public class Student {
	private int stuId;
	private String stuType;
	
	public Student(int stuId, String stuType) {
		super();
		this.stuId = stuId;
		this.stuType = stuType;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuType() {
		return stuType;
	}
	public void setStuType(String stuType) {
		this.stuType = stuType;
	}
	

}
