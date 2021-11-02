//Q2 
//Input	Sh@By%576 - Character.isUppercase
//Count of Uppercase - 2
//LC - 2
//Digits - 3
//Special - 2

package com.revature.app.codingsession;

import java.util.Scanner;


public class CountCases {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = sc.nextLine();
		int uc=0;
		int lc=0;
		int dc=0;
		int spc=0;
		for(int i=0; i < str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				uc++;
			}
			else if(Character.isLowerCase(str.charAt(i))) {
				lc++;
			}
			else if(Character.isDigit(str.charAt(i))) {
				dc++;
			}
			else {
				spc++;
			}
		}
		System.out.println("Upper Case: "+ uc+" Lowercase : "+lc+" Digits: "+dc+" Special "+spc);
	}

}
