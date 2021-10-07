package com.revature.app.codingsession;

import java.util.Scanner;

public class StringSplitDemo {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter a String  : ");
		 String line = scanner.nextLine();
		// System.out.println( line.split("/t"));
		 String newWord = null;
//		 for(String s : line.split(" ")) {
//		 //System.out.println(s);
//		 newWord += s; 
//			 
//		 }
		 String[] lines = line.split(" ");
		 for(int i=0; i<= lines.length ;i++) {
			 //System.out.println(lines[0].);
			 System.out.println((lines[i]));
			
		 }
	}

}

//Sharad Code

//public static void main(String[] args) {
//	String str = "hello all in the world";
//	String[] words = str.split(" ");
//	
//	for (int i = 0; i < words.length; i++) {
//		//System.out.println(words[i]);
//		for (int j = words[i].length()-1; j >=0; j--) {
//			System.out.print(words[i].charAt(j));
//		}
//		System.out.println();
//	}
//}
