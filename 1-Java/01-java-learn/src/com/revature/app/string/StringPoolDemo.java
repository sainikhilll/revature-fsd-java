package com.revature.app.string;

import java.util.Scanner;

public class StringPoolDemo {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String str1 = "Nik";
	String str2 = scanner.nextLine();
	if(str1 == str2) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
	
}
}
