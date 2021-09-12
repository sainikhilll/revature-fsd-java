package com.revature.bankapp.menu;

import com.revature.bankapp.model.DataManager;

public class TransactionMenu extends Menu {

	public TransactionMenu(String name) {
		super(name);
		addMenuItem("Withdrwal");
		addMenuItem("Deposit");
		addMenuItem("View Balance");
		addMenuItem("View Transaction Log");
		addMenuItem("Back");
	}

	@Override
	void handleAction() {
		switch (selection) {
		case 1:
			System.out.println("withDrawal granted");
			DataManager.withdrawl();
			displayMenuAndCaptureSelection();
			break;
		case 2:
			System.out.println("Deposit Granted");
			DataManager.deposit();
			displayMenuAndCaptureSelection();
			break;
		case 3:
			System.out.println("View Balance");
			DataManager.getAccountBalance();
			displayMenuAndCaptureSelection();
			break;
		case 4:
			System.out.println("View Treansaction Log");
			break;
		case 5:
			break;
		}
	}

}
