package com.revature.bankapp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.bankapp.menu.TransactionMenu;

public class DataManager {
	private static List<Customer> customerList = new ArrayList<>();
	private static List<Account> accountList = new ArrayList<Account>();
	private static int choice;
	static {
		customerList.add(new Customer("Sai", "Nikhil", "nani", "1111"));
		
	}

	public static void addCustomer(Customer customer) {
		customerList.add(customer);
	}

	public static Customer getCustomerByEmail(String email) {
		for (Customer customer : customerList) {
			if (customer.getEmail().equals(email)) {
				return customer;
			}
		}
		return null;
	}
//	public static void addAccount(Account account) {
//		accountList.add(account);
//	}
//	public static void getAccountDetails() {
//		for (Account account : accountList) {
//			System.out.println(account);
//		}
//	}
//	public static void getAccountBalance() {
//		System.out.println("Balance :" + accountList.get(choice).getBalance());
//	}
//	public static void selectAccount() {
//		System.out.print("Select account to perform transaction : ");
//		Scanner scanner = new Scanner(System.in);
//		choice = scanner.nextInt();
//		//performTransaction();
//	}

//	public static void performTransaction() {
//		
//		TransactionMenu transactionMenu = new TransactionMenu("Transaction Menu");
//		transactionMenu.displayMenuAndCaptureSelection();
//	}
//	public static void withdrawl() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter amount to withdraw : ");
//		long withdrwalAmount = scanner.nextLong();
//		if(withdrwalAmount <= 0) {
//			System.out.println("You cannot withdraw negative amount");
//		}
//		else if(accountList.get(choice).getBalance() >= withdrwalAmount) {
//			 accountList.set(choice, new Account(accountList.get(choice).getName(),accountList.get(choice).getBranch(),accountList.get(choice).getBalance()-withdrwalAmount));
//			 System.out.println(" Balance : " + accountList.get(choice).getBalance());
//		}else {
//			System.out.println("Insuuficient Funds");
//			System.out.println(" Balance : " + accountList.get(choice).getBalance());
//		}
//	}
//	public static void deposit() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter amount to deposit: ");
//		long depositAmount = scanner.nextLong();
//		accountList.set(choice, new Account(accountList.get(choice).getName(),accountList.get(choice).getBranch(),accountList.get(choice).getBalance()+depositAmount));
//		System.out.println(" Balance : " + accountList.get(choice).getBalance());
//		
//	}
}
