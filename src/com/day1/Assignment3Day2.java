package com.day1;

import java.util.Scanner;

public class Assignment3Day2 {
	public static void main(String[] args) {
		char ch = 'B';
		int marks;
		System.out.println("ENTER MARKS\t:");
		Scanner sc = new Scanner(System.in);
		marks = sc.nextInt();
		switch (marks) {
		case 100:
		case 99:
		case 98:
		case 97:
		case 96:
		case 95:
		case 94:
		case 93:
		case 92:
		case 91:
		case 90:
		case 89:
		case 88:
		case 87:
		case 86:
		case 85:
		case 84:
		case 83:
		case 82:
		case 81:
		case 80:
			ch ='A';
			break;
		case 79:
		case 78:
		case 77:
		case 76:
		case 75:
		case 74:
		case 73:
			ch='B';
			break;
		case 72:
		case 71:
		case 70:
		case 69:
		case 68:
		case 67:
		case 66:
		case 65:
			ch ='C';
			break;
		case 64:
		case 63:
		case 62:
		case 61:
		case 60:
		case 59:
		case 58:
		case 57:
		case 56:
		case 55:
			ch ='D';
			break;
		case 54:
			ch ='E';
			break;
			

		default:
			System.out.println("Grade doesnt exist");
			break;
		}
		System.out.println("Grade\t:"+ch);
	}

}
