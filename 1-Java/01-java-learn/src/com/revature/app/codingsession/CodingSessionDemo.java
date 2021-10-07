package com.revature.app.codingsession;

import java.util.Scanner;

public class CodingSessionDemo {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter a number to print multiplication table : ");
		 int number = scanner.nextInt();
		 for(int i = 1; i <= 10; i++) {
			  System.out.format("%2d x %3d = % 3d \n",number,i,number*i);
			// System.out.println(String.format("%4d",(number+ "x" + i + " = " + (number*i))));
		 }
	}

}
