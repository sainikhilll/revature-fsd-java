package com.revature.bankapp.form;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.bankapp.dao.impl.CustomerDaoImpl;
import com.revature.bankapp.menu.CustomerMenu;
import com.revature.bankapp.model.Customer;
import com.revature.bankapp.model.DataManager;

public class LoginForm extends Form {
	private String email;
	private String password;
	private Customer currentCustomer;
	public LoginForm(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void captureData() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter MailId:");
		email = scanner.nextLine();
		System.out.print("Enter Password:");
		password = scanner.nextLine();
		//System.out.println("Welcome Back!!");

	}

	@Override
	public void action() {
		 CustomerDaoImpl customerDaoImpl = new CustomerDaoImpl();
		Customer customer;
		try {
			customer = customerDaoImpl.getCustomerByEmail(email);
			if (customer == null) {
				System.out.println("Invalid Password or Email");
			} else if (customer.getPassowrd().equals(password)) {
				success = true;
	      	   //DataManager.setCurrentCustomer(customer);
				currentCustomer = customer;
				System.out.println("Login Successful");
				System.out.println("Welcome " + customer.getFirstName());
				CustomerMenu customerMenu = new CustomerMenu("Customer Menu");
				customerMenu.displayMenuAndCaptureSelection();

			} else  {
				System.out.println("Invalid Password or Email");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public Customer getCurrentCustomer() {
		return currentCustomer;
	}

	public void setCurrentCustomer(Customer currentCustomer) {
		this.currentCustomer = currentCustomer;
	}
}
