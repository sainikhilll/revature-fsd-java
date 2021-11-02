//str = "abcdefghijkl";
//display all substring of 3 characters 
//do not include characters again
//
//abc
//def
//ghi
//jkl

package com.revature.app.codingsession;

import java.util.Scanner;

public class SubstringDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		int count=0;
		
		for(int i =0; i< str.length(); i=i+3) {
			//System.out.println(i+3);
			if((i+3)>str.length()){
				System.out.println(str.substring(i));
				break;
			}
			System.out.println(str.substring(i, i+3));
			count++;
		}
		//System.out.println(count);

	}

}
