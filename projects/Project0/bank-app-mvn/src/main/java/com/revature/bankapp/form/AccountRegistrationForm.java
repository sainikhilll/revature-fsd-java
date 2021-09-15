package com.revature.bankapp.form;

import java.util.Scanner;

import com.revature.bankapp.model.Account;
import com.revature.bankapp.model.Customer;
import com.revature.bankapp.model.DataManager;

public class AccountRegistrationForm extends Form{

	public AccountRegistrationForm(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void captureData() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Name : ");
		String name = scanner.nextLine();
		System.out.print("Enter Branch name : ");
		String branch = scanner.nextLine();
		System.out.print("Enter starting balance : ");
		long balance = scanner.nextLong();
		
		Customer.addAccount(new Account(name,branch,balance,Account.createTransactionList()));	
	}

	@Override
	public void action() {
		success = true;
		
	}
	
}
