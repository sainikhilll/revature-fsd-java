package com.revature.bankapp.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.bankapp.dao.impl.EmployeeDaoImpl;
import com.revature.bankapp.dao.impl.TransactionDaoImpl;

public class DatabaseManager {
	private static Customer currentCustomer;
	private static long currentAccountId;

	public static Customer getCurrentCustomer() {
		return currentCustomer;
	}

	public static void setCurrentCustomer(Customer currentCustomer) {
		DatabaseManager.currentCustomer = currentCustomer;
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

	public static long getCurrentAccountId() {
		return currentAccountId;
	}

	public static void setCurrentAccountId(long currentAccountId) {
		DatabaseManager.currentAccountId = currentAccountId;
	}

	public static void withdrwal() {
		System.out.println("Enter amount to withdraw");
		Scanner sc = new Scanner(System.in);
		long amount = sc.nextLong();
		long accountNo = DatabaseManager.getCurrentAccountId();
		TransactionDaoImpl transactionDaoImpl = new TransactionDaoImpl();
		long currentBalance = 0;
		try {
			currentBalance = transactionDaoImpl.showBalance(accountNo);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (currentBalance >= amount) {
			try {
				transactionDaoImpl.performWithdrawl(accountNo, currentBalance - amount);

				transactionDaoImpl.addTransaction(accountNo, "Withdrwal", amount);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (amount < 0) {
			System.out.println("Enter Valid Amount");
		} else {
			System.out.println("Insufficient Funds");
		}

	}

	public static void deposit() {
		System.out.print("Enter amount to deposit : ");
		Scanner sc = new Scanner(System.in);
		long amount = sc.nextLong();
		long accountNo = DatabaseManager.getCurrentAccountId();
		TransactionDaoImpl transactionDaoImpl = new TransactionDaoImpl();
		long currentBalance = 0;

		try {
			currentBalance = transactionDaoImpl.showBalance(accountNo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (amount > 0) {
			try {
				transactionDaoImpl.performDeposit(accountNo, currentBalance + amount);

				transactionDaoImpl.addTransaction(accountNo, "Deposit", amount);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("Enter valid amount");
		}
	}

	public static void transfer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account Id to which you want to transfer funds");
		long toAccountId = sc.nextLong();
		System.out.println("Enter Amount to transafer");
		long amount = sc.nextLong();
		long fromAccountId = DatabaseManager.getCurrentAccountId();

		TransactionDaoImpl transactionDaoImpl = new TransactionDaoImpl();
		long currentBalanceOfFromAccount = 0;
		long currentBalanceOfToAccount = 0;

		try {
			currentBalanceOfFromAccount = transactionDaoImpl.showBalance(fromAccountId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			currentBalanceOfToAccount = transactionDaoImpl.showBalance(toAccountId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (amount <= 0) {
			System.out.println("Enter Valid amount ");
		} else if (amount >= 0 && currentBalanceOfFromAccount >= amount) {
			try {
				transactionDaoImpl.performDeposit(toAccountId, currentBalanceOfToAccount + amount);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				transactionDaoImpl.performWithdrawl(fromAccountId, currentBalanceOfFromAccount - amount);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				transactionDaoImpl.addTransaction(fromAccountId, "Transafer to Account No" + toAccountId, amount);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("enter valid amount");
		}

	}

	public static void showTransactionsList() {
		TransactionDaoImpl transactionDaoImpl = new TransactionDaoImpl();
		long accountNo = DatabaseManager.getCurrentAccountId();

		try {
			ArrayList<Transaction> transactionList = (ArrayList<Transaction>) transactionDaoImpl
					.showTransactions(accountNo);
			transactionList.forEach(System.out::println);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void showCustList() {
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		try {
			ArrayList<Customer> custList = (ArrayList<Customer>) employeeDaoImpl.showCustomerList();
			custList.forEach(System.out::println);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static long employeeSelect() {
		System.out.print("Select account to view Transaction List : ");
		Scanner scanner = new Scanner(System.in);
		long choice = scanner.nextInt();
		return choice;
	}
	
	public static void employeeViewTransactionList(long accountId) {
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		List<Transaction> transactionList = new ArrayList<>();
		try {
			transactionList = employeeDaoImpl.showTransList(accountId);
			transactionList.forEach(System.out::println);
			 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void showAccountListForVerification() {
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		List<Account> accList = new ArrayList<>();
		
		try {
			accList = employeeDaoImpl.getAccountsToVerify();
			accList.forEach(System.out::println);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter account number to Approve : ");
		long account_id = sc.nextLong();
		try {
			employeeDaoImpl.approveAccount(account_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void showAccountListToReject() {
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		List<Account> accList = new ArrayList<>();
		
		try {
			accList = employeeDaoImpl.getAccountsToVerify();
			accList.forEach(System.out::println);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter account number to reject : ");
		long account_id = sc.nextLong();
		try {
			employeeDaoImpl.rejectAccount(account_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
