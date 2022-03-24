package com.day1;

public class Assignment1Day2 {
	public static void main(String[] args) {
		
		boolean bool=true;
		for(int i=0;i<5;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(j+"\t");
				if(j>5) {
					System.out.println();
					continue;
					//break;
				}
			}
			System.out.println("Outer loop");
		}
		System.out.println("end");
	}

}
