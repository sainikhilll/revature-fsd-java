package com.revature.app.learnstatic;

public class AnotherClass {

	public static void main(String[] args) {
		System.out.println(StaticDemo.age);
		StaticDemo.age = 25;
		System.out.println(StaticDemo.age);
		
		StaticDemo sd = new StaticDemo();
		sd.staticMethod();

	}

}
