package com.day1;

public class Assignment7 {
	public static void main(String[] args) {
		
		boolean bool1 = false;
		boolean bool2 = true;
		boolean bool3 = true;
		if(bool1 && (bool1 && (bool2=false))) {			// assignment is not possible in a conditional statement or if it's neccessary do it using braces
			System.out.println("Success");
			
		}else {
			System.out.println("Failure");
		}
		System.out.println("bool2 value:"+bool2);
	
}
}
