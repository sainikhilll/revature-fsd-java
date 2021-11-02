package com.revature.app.codingsession;

import java.util.Scanner;

public class CheckingAlphabets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		int count = 0;
		boolean there = true;
		
		for(char i = 'a'; i<='z'; i++) {
			if(str.indexOf(i) != -1){
				count++;
				there=false;
			}
		}
		System.out.println(count);
		if(count >= 26) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
//		if(there == true) {
//			System.out.println("Yes");
//		}else {
//			System.out.println("No");
//		}
//	}
}}
