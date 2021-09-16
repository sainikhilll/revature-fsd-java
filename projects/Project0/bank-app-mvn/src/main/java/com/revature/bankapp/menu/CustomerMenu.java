package com.revature.bankapp.menu;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.revature.bankapp.dao.impl.AccountDaoImpl;
import com.revature.bankapp.form.AccountRegistrationForm;
import com.revature.bankapp.model.Account;
import com.revature.bankapp.model.Customer;
import com.revature.bankapp.model.DatabaseManager;

public class CustomerMenu extends Menu {

	public CustomerMenu(String name) {
		super(name);

		addMenuItem("Create new Account");
		addMenuItem("View Accounts");
		addMenuItem("Logout");

		displayMenuAndCaptureSelection();
	}

	@Override
	void handleAction() {
		Scanner scanner = new Scanner(System.in);
		switch (selection) {
		case 1:
			AccountRegistrationForm accountRegistrationForm = new AccountRegistrationForm("New Account registartion form");
			accountRegistrationForm.captureDataAndPerformAction();
			displayMenuAndCaptureSelection();
			break;
		case 2:
			System.out.println("These are Your Accounts");
			//System.out.println(DataManager.getCurrentCustomer().getAccountList());
			AccountDaoImpl accountDaoImpl = new AccountDaoImpl();
			try {
				ArrayList<Account>accountList=(ArrayList<Account>) accountDaoImpl.showAccounts();
				accountList.forEach(System.out::println);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			long accountID = DatabaseManager.selectAccount();
			DatabaseManager.setCurrentAccountId(accountID);
			
			TransactionMenu transactionMenu = new TransactionMenu("Transaction Menu");
			transactionMenu.displayMenuAndCaptureSelection();
			break;
		case 3:
			System.out.println("Logout");
			break;
		}

	}
//	public static long selectAccount() {
//		System.out.print("Select account to perform transaction : ");
//		Scanner scanner = new Scanner(System.in);
//		long choice = scanner.nextInt();
////	    Customer.setCurrentAccount(DataManager.getCurrentCustomer().getAccountList().get(choice-1));
////	    System.out.println(Customer.getCurrentAccount());
////		if (choice <= 0 && choice > DataManager.getCurrentCustomer().getAccountList().size()) {
////			System.out.println("Choose valid Account");
////			selectAccount();
////		}
//
//		// performTransaction();
//		return choice;
	}


