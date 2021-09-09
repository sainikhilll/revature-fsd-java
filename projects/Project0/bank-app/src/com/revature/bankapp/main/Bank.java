package com.revature.bankapp.main;

import java.util.Scanner;

public class Bank {

	public static void printMenu() {
		System.out.println("  Welcome to ABC Bank");
		System.out.println("========================");
		System.out.println("1. Registration");
		System.out.println("2. Customer Login");
		System.out.println("3. Employee Login");
		System.out.println("4. Exit");
		System.out.println("========================");
	}

	public static void main(String[] args) {
		int choice = 0;

		Scanner scanner = new Scanner(System.in);

		while (choice != 4) {
			printMenu();
			

			switch (choice) {
			case 1:
				System.out.println("Thanks for choosing our Bank");
				BankMain bankMain = new BankMain();
				bankMain.collectingDetails();
				printMenu();
			case 2:
				System.out.println("Thanks for choosing our Bank");
				CustomerLogin customerLogin = new CustomerLogin();
				customerLogin.diaplayCutsomerMenuAndAuthentication();
				break;
			case 3:
				System.out.println("Employee login under Creation");
				break;
			case 4:
				System.out.println("Exiting");
				break;

			}
		}

	}

}
