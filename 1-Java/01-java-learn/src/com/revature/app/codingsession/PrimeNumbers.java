package com.revature.app.codingsession;

public class PrimeNumbers {

	public static void main(String[] args) {
		int num = 0;
		int count = 0;
		for (int i = 200; i <= 300; i++) {
			count = 0;
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					count++;
				}
			}

			if (count == 2) {
				System.out.println(i);
			}
		}
	}
}
