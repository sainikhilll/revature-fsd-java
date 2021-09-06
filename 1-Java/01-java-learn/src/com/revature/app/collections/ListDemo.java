package com.revature.app.collections;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
//import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class ListDemo {
	
	public static void main(String[] args) {
		
		Integer age = 10;
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(78);
		arrayList.add(77);
		arrayList.add(76);
		arrayList.add(75);
		arrayList.add(74);
		Scanner scanner = new Scanner(System.in);
		for (Integer i =5;i<=10;i++) {
			//System.out.println(i);
			Integer x=scanner.nextInt();
			arrayList.add(x);
		}
		
		for (Integer number : arrayList) {
			System.out.println(number);
		}
		Collections.sort(arrayList);
		System.out.println("Sorted");
		System.out.println("========");
		for (Integer number : arrayList) {
			System.out.println(number);
		}
		
		//String name = arrayList.get(0).toString();
		//System.out.println(name);
	}
}
