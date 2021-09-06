package com.revature.app.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) throws java.text.ParseException {
		Scanner scanner = new Scanner(System.in);
		/*
		 * try { int age = scanner.nextInt(); System.out.println(age); } catch
		 * (InputMismatchException e) { System.out.println("Enter valid Value"); }
		 * 
		 * System.out.println("After Catch Block");
		 * 
		 */SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		try {
			System.out.println(sdf.parse("01/01/2021"));
		} catch (ParseException e) {
			System.out.println("Enter in dd/mm/yyyy");
		}
	}

	public void methodThrowingException(int age) throws CustomException {
		if (age < 0) {
			throw new CustomException("'age' cannot be negative");
		}
		System.out.println("MethodProcessing");
	}

}
