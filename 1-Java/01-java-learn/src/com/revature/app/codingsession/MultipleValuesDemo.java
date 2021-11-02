//Enter 3 values- 33 44 55
//int[] arr = new int[3];
//Display the largest value.


package com.revature.app.codingsession;

import java.util.Scanner;

public class MultipleValuesDemo {

	public static void main(String[] args) {
		int[] arr = new int[3];
		Scanner sc = new Scanner(System.in);
		int val1 = sc.nextInt();
		int val2 = sc.nextInt();
		int val3 = sc.nextInt();
		arr[0]=val1;
		arr[1]=val2;
		arr[2]=val3;
		int max=arr[0];
		for(int i=0; i<3;i++) {
			if(arr[i]>=max) {
				max=arr[i];
			}
		}System.out.println("Max = " + max);
		

	}

}
