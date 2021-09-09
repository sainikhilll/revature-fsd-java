package com.revatue.bankapp.main;

import com.revature.bankapp.menu.CustomerMenu;
import com.revature.bankapp.menu.MainMenu;

public class BankApp {

	public static void main(String[] args) {
		MainMenu menu = new MainMenu("Main Menu");
		
		//menu.displayMenu();
		// menu.mainMenu();
		menu.displayMenuAndCaptureSelection();
		
//	CustomerMenu menu1 = new CustomerMenu("Customer Menu");
//		menu1.addMenuItem("Create new Account");
//		menu1.addMenuItem("View Accounts");
//		menu1.addMenuItem("Logout");
//		
//		menu1.displayMenuAndCaptureSelection();
	}

}
