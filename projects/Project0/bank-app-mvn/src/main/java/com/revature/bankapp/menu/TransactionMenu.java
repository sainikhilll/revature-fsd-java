package com.revature.bankapp.menu;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.bankapp.dao.impl.TransactionDaoImpl;
import com.revature.bankapp.model.Customer;
import com.revature.bankapp.model.DatabaseManager;

public class TransactionMenu extends Menu {

	public TransactionMenu(String name) {
		super(name);
		addMenuItem("Withdrwal");
		addMenuItem("Deposit");
		addMenuItem("View Balance");
		addMenuItem("View Transaction Log");
		addMenuItem("Transafer to another Account");
		addMenuItem("Back");
	}

	@Override
	void handleAction() {
		switch (selection) {
		case 1:
			System.out.println("withDrawal granted");
//			Customer.withdrawl();
//			System.out.println("Enter amount to withdraw");
//			Scanner sc = new Scanner(System.in);
//			long amount = sc.nextLong();
//			long accountNo = DatabaseManager.getCurrentAccountId();
//			TransactionDaoImpl transactionDaoImpl = new TransactionDaoImpl();
//			long currentBalance = 0;
//			try {
//				currentBalance = transactionDaoImpl.showBalance(accountNo);
//			} catch (SQLException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			
//			try {
//				transactionDaoImpl.performWithdrawl(accountNo, currentBalance - amount);
//			} catch (SQLException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
			DatabaseManager db = new DatabaseManager();
			db.withdrwal();
			displayMenuAndCaptureSelection();
			break;
		case 2:
			System.out.println("Deposit Granted");
			DatabaseManager db2  = new DatabaseManager();
			db2.deposit();
			displayMenuAndCaptureSelection();
			break;
		case 3:
			System.out.print(" Balance : ");
			 long accountId = DatabaseManager.getCurrentAccountId();
				TransactionDaoImpl transactionDaoImpl2 = new TransactionDaoImpl();
				try {
					System.out.println( transactionDaoImpl2.showBalance(accountId));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
			//Customer.getAccountBalance();
		   
			displayMenuAndCaptureSelection();
			break;
		case 4:
			long acco = DatabaseManager.getCurrentAccountId();
			System.out.println("This is account_Id" + acco +"Transaction Log");
			DatabaseManager.showTransactionsList();
			displayMenuAndCaptureSelection();
			break;
		case 5:
			System.out.println("Transafer");
			DatabaseManager.transfer();
			displayMenuAndCaptureSelection();
			break;
		case 6 :
			break;
		}
	}

}
