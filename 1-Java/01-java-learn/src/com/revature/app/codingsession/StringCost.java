package com.revature.app.codingsession;

import java.util.Scanner;

//Q1
//Input    abggkt (lower case)
//1+2+7+7+11+20 = 48
//Display cost of string - a-1 b-2 
//a 97 -96
//
//


public class StringCost {
	public static void main(String[] args) {
		int sum = 0;
		String newString ="";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = sc.nextLine();
		
		for(int i=0; i < str.length(); i++) {
			char charecter = str.charAt(i);
			sum = (int)charecter+3;
			if(sum==123) {
				sum = 97;
			}
			else if(sum==124) {
				sum=98;
			}
			else if(sum==125) {
				sum = 99;
			}
			newString += Character.toString((char) (sum));
			
		}
		System.out.println("Modified String: " + newString);
	}
}
