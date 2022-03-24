package com.day3;

public class StaticStudent {
	static int stuCount = 10;

	public static int getStuCount() {
		return stuCount;
	}

	public StaticStudent() {
		stuCount+=1;
	}
	public static void main(String[] args) {
		StaticStudent st = new StaticStudent();
		System.out.println("Student Count\t:"+st.getStuCount());
		System.out.println("END");
	}
	
	

}
