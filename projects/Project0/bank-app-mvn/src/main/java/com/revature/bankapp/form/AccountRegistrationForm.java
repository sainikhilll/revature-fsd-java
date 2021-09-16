package com.revature.bankapp.form;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.bankapp.dao.impl.AccountDaoImpl;
import com.revature.bankapp.model.Account;
import com.revature.bankapp.model.DatabaseManager;

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
		
		AccountDaoImpl accountDaoImpl = new AccountDaoImpl();
		try {
			accountDaoImpl.create(new Account(name,branch,balance), DatabaseManager.getCurrentCustomer().getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void action() {
		success = true;
		
	}
	
}
