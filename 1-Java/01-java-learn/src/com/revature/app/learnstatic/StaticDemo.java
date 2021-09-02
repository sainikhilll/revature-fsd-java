package com.revature.app.learnstatic;

public class StaticDemo {
	public static int age = 100;
	private int capacity = 20;
	
	public static void staticMethod() {
		System.out.println("called");
		System.out.println(age);
		//System.out.pritln(capacity);
	}
	public static void main() {
		System.out.println(age);
		int capacity = 20;
		System.out.println(capacity);
		
		StaticDemo staticdemo = new StaticDemo();
		System.out.println(staticdemo.capacity);
	}
}
