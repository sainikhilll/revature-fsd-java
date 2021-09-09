package com.revature.bankapp.menu;

import java.util.Scanner;

import com.revature.bankapp.form.LoginForm;
import com.revature.bankapp.model.Customer;
import com.revature.bankapp.model.DataManager;

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
			System.out.println("\n======== ");
			System.out.println("Thanks for choosing out Bank\n");
			System.out.println("Register New Customer");
			System.out.println("========\n");
			System.out.print("Enter First Name:");
			String firstName = scanner.nextLine();
			System.out.print("Enter LastName:");
			String lastName = scanner.nextLine();
			System.out.print("Enter emailId:");
			String email = scanner.nextLine();
			System.out.print("Setup password:");
			String password = scanner.nextLine();
			
			DataManager.addCustomer(new Customer(firstName, lastName, email, password));
			displayMenuAndCaptureSelection();
			break;
		case 2 :
//			System.out.println("\n======== ");
//			System.out.println("Thanks for choosing out Bank\n");
//			System.out.println("Login");
//			System.out.println("========\n");
//			System.out.print("Enter MailId:");
//			email = scanner.nextLine();
//			System.out.print("Enter Password:");
//			password = scanner.nextLine();
//			System.out.println("Welcome Back!!");
//			
//			Customer customer = DataManager.getCustomerByEmail(email);
//			if(customer.getPassowrd().equals(password)) {
//				System.out.println("Login Successful");
//				System.out.println("Welcome " + customer.getFirstName());
//			}
			LoginForm loginForm = new LoginForm("Customer registration form");
			loginForm.captureDataAndPerformAction();
			break;
		case 3 :
			System.out.println("Welcome Back!!!");
			break;
		case 4 : 
			System.out.println("Closing The Application");
			break;

		}

	}
}
