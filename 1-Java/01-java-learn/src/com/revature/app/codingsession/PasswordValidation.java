/* Question PAssword Validation
Enter a password
check it to be string enough with following rules

at least 8 characters
at least 1 uppercase
at least 1 lowercase
at least 1 special character
at least 1 digit

pwd is strong enough
pwd missing uppercase
pwd missing lowercase
pwd missing digit
pwd missing special character
pwd length less than 8 */

package com.revature.app.codingsession;

import java.util.Scanner;

public class PasswordValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter password : ");
		String pwd = sc.nextLine();
		int upCount = 0;
		int loCount = 0;
		int digCount = 0;
		int spCount = 0;
		for (int i = 0; i <= pwd.length()-1; i++) {

			if (Character.isUpperCase(pwd.charAt(i))) {
				upCount += 1;
			}
			else if (Character.isLowerCase(pwd.charAt(i))) {
				loCount += 1;
			}
			else if (Character.isDigit(pwd.charAt(i))) {
				digCount += 1;
			} else {
				spCount += 1;
			}

		}
		if (pwd.length() >= 8) {
			if (upCount <= 0) {
				System.out.println("Upper case missing");
			}
			if (loCount <= 0) {
				System.out.println("lower case missing");
			}
			if (digCount <= 0) {
				System.out.println("Digit is missing");
			}
			if(spCount <= 0) {
				System.out.println("Special charcter missing");
			}

		} else {
			System.out.println("Password should be 8 characters length");
		}
		if(upCount > 0 && loCount > 0 && spCount > 0 && digCount > 0 && pwd.length() == 8) {
			System.out.println("Passsword is Strong");
		}
	}
}
