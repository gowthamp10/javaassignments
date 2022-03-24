package com.day3;

public class Array2DDemo {
	public static int arr1[][]= {{1,1,1},{1,1,1}};
	public static int arr2[][]= {{2,2,2},{2,2,2}};
	public static void add() {
		int sum[][]= {{0,0,0},{0,0,0}};
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				sum[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(sum[i][j]);
			}System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		add();
	}
}
