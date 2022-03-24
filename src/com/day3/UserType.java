package com.day3;

public class UserType {
	String name;

	UserType(String name) {
		this.name = name;
	}
	UserType(){
		System.out.println("Student");
		name = "Student";
	}
	public static void main(String[] args) {
		UserType user1 =new UserType("Faculty");
		UserType user2 = new UserType();
		
		System.out.println("name:"+user1.name);
		System.out.println("name:"+user2.name);
	}

}
