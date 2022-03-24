package com.day3;

public class Class1 {
	
	
	static int i=22;
	static int j=14000;
	static boolean k;
	static boolean l;
	public static void main(String[] args) {
		i=22;
		j=14000;
		Class1 cl1 = new Class1();
		k =cl1.method1(i);
		l =cl1.method2(j);
		
		if (k == true && l == true) {
			System.out.println("Employee new");
		}
		else {
			System.out.println("Not new Employee");
		}
	}
	public boolean method1(int i)
	{
		if(i>20 && i<30) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean method2(int j)
	{
		if(i>=14000 && i<20000) {
			return true;
		}
		else {
			return false;
		}
	}
	

}
