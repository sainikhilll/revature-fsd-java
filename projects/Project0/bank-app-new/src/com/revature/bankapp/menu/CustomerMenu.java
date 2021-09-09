package com.revature.bankapp.menu;

public class CustomerMenu extends Menu {

	public CustomerMenu(String name) {
		super(name);
		CustomerMenu menu1 = new CustomerMenu("Customer Menu");
		addMenuItem("Create new Account");
		addMenuItem("View Accounts");
		addMenuItem("Logout");
		
		menu1.displayMenuAndCaptureSelection();
	}
		

	@Override
	void handleAction() {
		
	}

}
