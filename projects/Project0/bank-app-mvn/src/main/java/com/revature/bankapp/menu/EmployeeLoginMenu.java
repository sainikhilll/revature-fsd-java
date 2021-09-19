package com.revature.bankapp.menu;

import com.revature.bankapp.form.AccountRegistrationForm;
import com.revature.bankapp.form.CustomerRegistrationForm;
import com.revature.bankapp.model.DatabaseManager;

public class EmployeeLoginMenu extends Menu {

	public EmployeeLoginMenu(String name) {
		super(name);
		addMenuItem("Approve Account");
		addMenuItem("Reject Account");
		addMenuItem("Show All Accounts");
		addMenuItem("Create a account for customer");
		addMenuItem("Logout");
	}

	@Override
	void handleAction() {
		switch (selection) {
		case 1:
			System.out.println("Approve accounts");
			break;
		case 2:
			System.out.println("Reject Accounts");
			break;
		case 3:
			System.out.println("Showing all Accounts");
			DatabaseManager.showCustList();
			long select = DatabaseManager.employeeSelect();
			DatabaseManager.employeeViewTransactionList(select);
			displayMenuAndCaptureSelection();
			break;
		case 4:
			System.out.println("Create a account for customer");
			CustomerRegistrationForm crf = new CustomerRegistrationForm("Customer Registartion");
			crf.captureDataAndPerformAction();
//			AccountRegistrationForm arf = new AccountRegistrationForm("Account Registration");
//			arf.captureDataAndPerformAction();
			break;
		case 5:
			System.out.println("Logging Out");
			break;
		}

	}

}
