package com.revature.bankapp.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Menu {
	protected String name;
	protected List<String> menuItems;
	protected int selection;

	public Menu(String name) {
		this.name = name;
		menuItems = new ArrayList<>();
	}

	public void addMenuItem(String menuItemName) {
		menuItems.add(menuItemName);
	}

	public void displayMenu() {
		System.out.println("====");
		System.out.println(name);
		System.out.println("====");
		for (int i = 0; i < menuItems.size(); i++) {
			System.out.println((i + 1) + ")" + menuItems.get(i));
			;
		}
		System.out.print("Choose the Option :");
	}

	public void captureSelection() {
//		Scanner scanner = new Scanner(System.in);
//		selection = Integer.parseInt(scanner.nextLine());
//		System.out.println("Selected option is: " + selection);
		try{
			Scanner scanner = new Scanner(System.in);
			selection = Integer.parseInt(scanner.nextLine());
			System.out.println("Selected option is: " + selection);
			if (selection >= 1 && selection <= menuItems.size()) { 
		
				handleAction();
				}
			else {
			System.out.println(" !!!Please enter valid option!!!  ");
			displayMenuAndCaptureSelection();
			}
		}catch(NumberFormatException e){
			System.out.println("!!!Please enter valid option!!!");
		}
	
	}

	public void displayMenuAndCaptureSelection() {
		displayMenu();
		captureSelection();
	}

	abstract void handleAction();

}
