package com.day8;

public class CourseRegistration {
	static protected  int regId;
	protected String CourseName;
	public CourseRegistration() {
		regId++;
	}
	public CourseRegistration(String courseName) {
		super();
		CourseName = courseName;
	}
	public void displayDetails() {
		System.out.println("Registration Id:\t"+this.regId);
		System.out.println("Course Name:\t"+this.CourseName);
	}
	

}
