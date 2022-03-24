package com.day5;

public class UserInput {
	public static void main(String[] args) {
		int number,iterations;
		number = Integer.parseInt(args[0]);
		iterations  = Integer.parseInt(args[1]);
		int limit = number+1;
		for(;number<limit;number++) {
			for(int j=1;j<iterations+1;j++)
			{
				System.out.println(number+"*"+j+" = "+(number*j));
			}
			System.out.println();
		}
	}

}
