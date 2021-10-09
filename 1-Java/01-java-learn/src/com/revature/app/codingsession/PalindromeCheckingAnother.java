package com.revature.app.codingsession;

import java.util.Scanner;

public class PalindromeCheckingAnother {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int len = word.length();
		int count = 0;
		for (int i = 0; i <= (len / 2)-1; i++) {
			if (word.charAt(i) == word.charAt(len - 1 - i)) {
				count += 1;
			}

		}
		if (count == len/2) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}

}
