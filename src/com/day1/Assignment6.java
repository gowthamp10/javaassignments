package com.day1;

public class Assignment6 {
	
	public static void main(String[] args) {
		int intVal = 10;
		float floatVal = 3.0f;
		boolean bool1 = true;
		boolean bool2 = false;
		boolean bool3 = true;
		
		//Arithematic modolus operator
		System.out.println("Arithematic");
		System.out.println(intVal+" % "+floatVal+ "="+(intVal%floatVal));
		System.out.println();
		//string concatination observe the difference
		System.out.println("String Concatination");
		System.out.println("Day"+2+"Session");
		System.out.println("\n"+2+3+"\n"+(2+3));
		System.out.println();
		//Realational equaltity operator 
		System.out.println("Realtional Operator");
		System.out.println(intVal+"=="+floatVal+"="+(intVal==floatVal));
		floatVal =10.0f;
		System.out.println(intVal+"=="+floatVal+"="+(intVal==floatVal));
		System.out.println();
		
		bool2 = false;
		if(bool1 || (bool1 && (bool2=false))) {			// assignment is not possible in a conditional statement or if it's neccessary do it using braces
			System.out.println("Success");
			
		}else {
			System.out.println("Failure");
		}
		System.out.println("bool2 value:"+bool2);
		
	
}
}
