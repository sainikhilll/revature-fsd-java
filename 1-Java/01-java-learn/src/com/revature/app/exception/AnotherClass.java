package com.revature.app.exception;

public class AnotherClass {

	public static void main(String[] args) {
		ExceptionDemo demo = new ExceptionDemo();
		try {
			demo.methodThrowingException(-1);
		} catch (CustomException e) {
			System.out.println(e.getMessage());
		}

	}

}
