package com.revature.bankapp.main;

import java.util.Scanner;

import com.revature.bankapp.data.DataManager;
import com.revature.bankapp.model.Customer;

public class CustomerLogin {
	private static String loginID;
	private static String password;

	public static boolean authentication(String iD, String pd) {
		DataManager dataManager = new DataManager();
		Customer customer = new Customer();
		
		if (dataManager.customerDetailsList.get(0).getMailId().equals(iD)&& dataManager.customerDetailsList.get(0).getPassword().equals(pd)) {
			return true;
		} else {
			return false;
		}
	}
	public static void diaplayCutsomerMenuAndAuthentication() {
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.print("LoginID : ");
		loginID = scanner.nextLine();
		System.out.print("Password : ");
		password = scanner.nextLine();
		boolean flag = authentication(loginID, password);
		if (flag == true) {
			System.out.println();
			System.out.println("Login Successful");
			CustomerMenu customerMenu = new CustomerMenu();
			System.out.println();
			customerMenu.displayCustomerActionoptions();
			
		} else {
			System.out.println("Enter Valid Credentials");
		}

	}
	

	public static void main(String[] args) {
		
		
	}

}
