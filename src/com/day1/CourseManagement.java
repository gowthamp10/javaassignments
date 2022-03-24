package com.day1;

public class CourseManagement {

	public static void main(String[] args) {
		Student st1 = new Student(10,"UG");
		Student st = new Student(1,"PG");
		st.setStuId(1);
		st.setStuType("UG");
		System.out.println("StudentId\t:"+st.getStuId()+"\nStudent Type\t:"+st.getStuType());
		System.out.println("StudentId\t:"+st1.getStuId()+"\nStudent Type\t:"+st1.getStuType());
	}

}
