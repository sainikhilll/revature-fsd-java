package com.revature.bankapp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private String passowrd;
	private static long counter = 0;
	private static List<Account> accountList = new ArrayList<Account>();
	private static int choice;
	
	static {
		accountList.add(new Account("Nikhil","Balaji Colony",5000));
	}
	public Customer(String firstName, String lastName, String email, String passowrd) {
		super();
		counter++;
		this.id = counter;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.passowrd = passowrd;
	}
	public static void addAccount(Account account) {
		accountList.add(account);
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
		if(choice < 0 && choice > accountList.size()) {
			System.out.println("Choose valid Account");
			selectAccount();
		}
		
		//performTransaction();
	}
	
	public static void withdrawl() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter amount to withdraw : ");
		long withdrwalAmount = scanner.nextLong();
		if(withdrwalAmount <= 0) {
			System.out.println("You cannot withdraw negative amount");
		}
		else if(accountList.get(choice).getBalance() >= withdrwalAmount) {
			 accountList.set(choice, new Account(accountList.get(choice).getName(),accountList.get(choice).getBranch(),accountList.get(choice).getBalance()-withdrwalAmount));
			 System.out.println(" Balance : " + accountList.get(choice).getBalance());
		}else {
			System.out.println("Insuuficient Funds");
			System.out.println(" Balance : " + accountList.get(choice).getBalance());
		}
	}
	
	public static void getAccountDetails() {
		for (Account account : accountList) {
			System.out.println(account);
		}
	}
	
	public static void getAccountBalance() {
		System.out.println("Balance :" + accountList.get(choice).getBalance());
	}
	
	public static void deposit() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter amount to deposit: ");
		long depositAmount = scanner.nextLong();
		accountList.set(choice, new Account(accountList.get(choice).getName(),accountList.get(choice).getBranch(),accountList.get(choice).getBalance()+depositAmount));
		System.out.println(" Balance : " + accountList.get(choice).getBalance());
		
	}
	
}
