//Number = 45		9
//sqr  = 2025		81
//left = 20    right = 25		l = 8   r =1 s =l+r = 9  Yes
//sum left + right = 45
//This is equal to my number n
//Yes / No
//right part will have digits as many in the number
//
//n=8 	No
//n=8 	No
//n = 11 	sq = 121   		l = 1  r = 21    No


package com.revature.app.codingsession;

import java.util.Scanner;

public class SplitNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		int org = num;
		int count = 0;
		String left;
		String right;
		while(num != 0) {
			num = num/10;
			count++;
		}
		System.out.println(count);
		int remainder =0;
		String sqrOfNum = String.valueOf(org*org);
		System.out.println(sqrOfNum);

		if(org == 1) {
			System.out.println("YEs");
		}
		else if(count ==1 && org!=1 ) {
			System.out.println("NO");
		}
		else {
		left = sqrOfNum.substring(0, sqrOfNum.length()/2);
		right =sqrOfNum.substring(sqrOfNum.length()/2, sqrOfNum.length());
		System.out.println(right);
		System.out.println(left);
		if(org == (Integer.parseInt(left))+(Integer.parseInt(right))){
			System.out.println("Yes");
		}
		else {
			System.out.println("NO");
		}
	}}

}
