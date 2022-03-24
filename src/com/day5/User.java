package com.day5;

public class User {
	private String uName;

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}
	
	public void display() {
		System.out.println("Length\t:"+uName.length());
		System.out.println("HI "+ uName.toLowerCase());
		System.out.println("Hi "+ uName.toUpperCase());
		System.out.println((char)uName.charAt(0)=='a');
		System.out.println("Hi "+uName);
	}
	
	public static void main(String[] args) {
		User user = new User();
		user.setuName("Gowtham P");
		System.out.println("User\t:"+user.getuName());
		user.display();
		//user.replace(user.getuName(), "SEED");
		System.out.println(user.getuName());
	}
}
