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
	private Account account;
	private  ArrayList<Account> accountList;
	
	private static Account currentAccount;
	
	public Customer() {}

	public static Account getCurrentAccount() {
		return currentAccount;
	}

	public static void setCurrentAccount(Account currentAccount) {
		Customer.currentAccount = currentAccount;
	}

	static {
		// accountList.add(new Account("Nikhil","Balaji Colony",5000));
		// map.put((long) 102,new Account("Venkat","Balaji Colony",6000));
	}
	
	public Customer(String firstName, String lastName, String email, String passowrd) {
		super();
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

	
	public void setAccountList(ArrayList<Account> accountList) {
		this.accountList = accountList;
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

	public static long selectAccount() {
		System.out.print("Select account to perform transaction : ");
		Scanner scanner = new Scanner(System.in);
		long choice = scanner.nextInt();
//	    Customer.setCurrentAccount(DataManager.getCurrentCustomer().getAccountList().get(choice-1));
//	    System.out.println(Customer.getCurrentAccount());
//		if (choice <= 0 && choice > DataManager.getCurrentCustomer().getAccountList().size()) {
//			System.out.println("Choose valid Account");
//			selectAccount();
//		}

		// performTransaction();
		return choice;
	}

//	public static void withdrawl() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter amount to withdraw : ");
//		long withdrwalAmount = scanner.nextLong();
//		if (withdrwalAmount <= 0) {
//			System.out.println("You cannot withdraw negative amount");
//		} else if (DataManager.getCurrentCustomer().getAccountList().get(choice-1).getBalance() >= withdrwalAmount) {
//			DataManager.getCurrentCustomer().getAccountList().get(choice-1).setBalance(
//					DataManager.getCurrentCustomer().getAccountList().get(choice-1).getBalance() - withdrwalAmount);
//			System.out.println(
//					" Balance : " + DataManager.getCurrentCustomer().getAccountList().get(choice-1).getBalance());
//			Account.addTransaction(withdrwalAmount+"  is debited from your account.");
//		} else {
//			System.out.println("Insuuficient Funds");
//			System.out.println(
//					" Balance : " + DataManager.getCurrentCustomer().getAccountList().get(choice-1).getBalance());
//		}
//	}
//
////	public static void getAccountDetails() {
////		Customer cus = DataManager.getCurrentCustomer();
////		cus.getAccountList();
////	}
//
//	public static void getAccountBalance() {
//		System.out.println("Balance :" + DataManager.getCurrentCustomer().getAccountList().get(choice-1).getBalance());
//	}
//
//	public static void deposit() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter amount to deposit: ");
//		long depositAmount = scanner.nextLong();
//		DataManager.getCurrentCustomer().getAccountList().get(choice-1)
//				.setBalance(DataManager.getCurrentCustomer().getAccountList().get(choice-1).getBalance() + depositAmount);
//		System.out.println("Balance :" + DataManager.getCurrentCustomer().getAccountList().get(choice-1).getBalance());
//		Account.addTransaction(depositAmount+"  is credited to your account");
//	}
//
//	public static ArrayList<Account> createAccountList() {
//		ArrayList<Account> list = new ArrayList<Account>();
//		return list;
//	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer_id = " + id + ", FirstName = " + firstName + ", LastName = " + lastName +"   " + account
				;
	}
	
	

	

}