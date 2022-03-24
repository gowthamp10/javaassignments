package com.day7;

public class StdentMain {
	
	public static void main(String[] args) {
		

		Hostelite hl = new Hostelite(10, "Hostelite", "Gowtham", "P", "Nilgiri", 3);
		DayScholar ds = new DayScholar(10, "DayScholar", "Sai Suhas", "P ", "Kavandala Sira");
		ds.setFeesPerMonth(1000);
		hl.setFeesPerMonth(1500);
		System.out.println(hl);
		System.out.println(ds);
		
	}

}
