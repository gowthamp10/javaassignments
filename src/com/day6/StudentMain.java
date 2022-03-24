package com.day6;

public class StudentMain {
	
	public static void main(String[] args) {
		Student st = new Student(10, "Dayscholar", "Gowtham", "P");
		/*st.setsId(Integer.parseInt(args[0]));
		st.setsName(args[1], args[2]);
		st.setResidentialStatus(args[3]);
		st.setFeesPerMonth(Integer.parseInt(args[4]));*/
		
		System.out.println("Student details:");
		System.out.println("Name\t:"+st.getsName());
		System.out.println("Student Id\t:"+st.getsId());
		System.out.println("Residential Status\t:"+st.getResidentialStatus());
		System.out.println("Fees per Month\t:"+st.getFeesPerMonth());
	}

}
