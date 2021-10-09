package com.revature.app.codingsession;

import java.util.Scanner;

public class PalindromeChecking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String reversed = "";
		for (int j = word.length()-1; j >=0; j--) {
			reversed += word.charAt(j);
		}
		if(word.equals(reversed)) {
			System.out.println(word+" is a palindrome word");
		}
		else {
			System.out.println(word+" is not palindrome");
		}
	}
}
