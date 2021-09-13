package com.revature.bankapp.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private String passowrd;
	private static long counter = 0;
	private static ArrayList<Account> accountList;
	private static int choice;

	static {
		// accountList.add(new Account("Nikhil","Balaji Colony",5000));
		// map.put((long) 102,new Account("Venkat","Balaji Colony",6000));
	}

	public Customer(String firstName, String lastName, String email, String passowrd, ArrayList<Account> accountList) {
		super();
		counter++;
		this.id = counter;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.passowrd = passowrd;
		this.accountList = accountList;
	}

	public static void addAccount(Account account) {
		DataManager.getCurrentCustomer().getAccountList().add(account);
	}

	public static ArrayList<Account> getAccountList() {
		return DataManager.getCurrentCustomer().accountList;
	}

	public static void setAccountList(ArrayList<Account> accountList) {
		Customer.accountList = accountList;
	}

	public String getPassowrd() {
		return passowrd;
	}

	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public static void selectAccount() {
		System.out.print("Select account to perform transaction : ");
		Scanner scanner = new Scanner(System.in);
		choice = scanner.nextInt();
		if (choice <= 0 && choice > DataManager.getCurrentCustomer().getAccountList().size()) {
			System.out.println("Choose valid Account");
			selectAccount();
		}

		// performTransaction();
	}

	public static void withdrawl() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter amount to withdraw : ");
		long withdrwalAmount = scanner.nextLong();
		if (withdrwalAmount <= 0) {
			System.out.println("You cannot withdraw negative amount");
		} else if (DataManager.getCurrentCustomer().getAccountList().get(choice).getBalance() >= withdrwalAmount) {
			DataManager.getCurrentCustomer().getAccountList().get(choice).setBalance(
					DataManager.getCurrentCustomer().getAccountList().get(choice).getBalance() - withdrwalAmount);
			System.out.println(
					" Balance : " + DataManager.getCurrentCustomer().getAccountList().get(choice).getBalance());
		} else {
			System.out.println("Insuuficient Funds");
			System.out.println(
					" Balance : " + DataManager.getCurrentCustomer().getAccountList().get(choice).getBalance());
		}
	}

//	public static void getAccountDetails() {
//		Customer cus = DataManager.getCurrentCustomer();
//		cus.getAccountList();
//	}

	public static void getAccountBalance() {
		System.out.println("Balance :" + DataManager.getCurrentCustomer().getAccountList().get(choice).getBalance());
	}

	public static void deposit() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter amount to deposit: ");
		long depositAmount = scanner.nextLong();
		DataManager.getCurrentCustomer().getAccountList().get(choice)
				.setBalance(DataManager.getCurrentCustomer().getAccountList().get(choice).getBalance() + depositAmount);
		System.out.println("Balance :" + DataManager.getCurrentCustomer().getAccountList().get(choice).getBalance());

	}

	public static ArrayList<Account> createAccountList() {
		ArrayList<Account> list = new ArrayList<>();
		return list;
	}

}
