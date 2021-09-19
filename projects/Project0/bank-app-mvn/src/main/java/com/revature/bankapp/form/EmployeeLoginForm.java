package com.revature.bankapp.form;

import java.util.Scanner;

import com.revature.bankapp.menu.EmployeeLoginMenu;

public class EmployeeLoginForm extends Form {
	
	private String email;
	private String password;

	public EmployeeLoginForm(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void captureData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter email Id : ");
		email = sc.nextLine();
		System.out.println("Enter Password");
		password = sc.nextLine();
		
	}

	@Override
	public void action() {
		if(email.equals("admin") && password.equals("1234")) {
			System.out.println("Welcome Back Admin!!!");
			EmployeeLoginMenu employeeLoginMenu = new EmployeeLoginMenu("Employee Menu");
			employeeLoginMenu.displayMenuAndCaptureSelection();
			
			success = true;
		}
		
	}
		
}
