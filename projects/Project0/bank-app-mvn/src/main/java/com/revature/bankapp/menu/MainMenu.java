package com.revature.bankapp.menu;

import java.util.Scanner;

import com.revature.bankapp.form.CustomerRegistrationForm;
import com.revature.bankapp.form.EmployeeLoginForm;
import com.revature.bankapp.form.LoginForm;

public class MainMenu extends Menu {

	public MainMenu(String name) {
		super(name);

		addMenuItem("Register as new Customer");
		addMenuItem("Login as Customer");
		addMenuItem("Login as Employee");
		addMenuItem("Exit");
	}
//	public static void mainMenu() {
//		MainMenu menu = new MainMenu("Main Menu");
//		menu.addMenuItem("Register as new Customer");
//		menu.addMenuItem("Login as Customer");
//		menu.addMenuItem("Login as Employee");
//		menu.addMenuItem("Exit");
//		menu.displayMenu();
//	}

	@Override
	void handleAction() {
		Scanner scanner = new Scanner(System.in);
		switch (selection) {
		case 1:
			CustomerRegistrationForm customerRegistrationForm = new CustomerRegistrationForm("Customer Registration Form");
			customerRegistrationForm.captureDataAndPerformAction();
			displayMenuAndCaptureSelection();
			break;
		case 2 :
			LoginForm loginForm = new LoginForm("Customer registration form");
			loginForm.captureDataAndPerformAction();
			displayMenuAndCaptureSelection();
			break;
		case 3 :
			EmployeeLoginForm employeeLoginForm = new EmployeeLoginForm("Employee Login Form");
			employeeLoginForm.captureDataAndPerformAction();
			displayMenuAndCaptureSelection();
			break;
		case 4 : 
			System.out.println("Closing The Application");
			break;

		}

	}
}
