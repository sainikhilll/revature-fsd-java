package com.revature.app.bank;

import java.util.Scanner;

public class Bank {

	public static void printMenu() {
		System.out.println("  Welcome to ABC Bank");
		System.out.println("========================");
		System.out.println("1. Customer Login");
		System.out.println("2. Employee Login");
		System.out.println("3. Exit");
		System.out.println("========================");
	}

	public static void main(String[] args) {
		int choice = 0;

		Scanner scanner = new Scanner(System.in);

		while (choice != 3) {
			printMenu();
			System.out.print("Enter Your Choice : ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println();
				System.out.println("Thanks for choosing our Bank");
				CustomerLogin customerLogin = new CustomerLogin();
				 customerLogin.diaplayCutsomerMenuAndAuthentication();
				break;
			case 2:
				System.out.println("Employee login under Creation");
				break;
			case 3:
				System.out.println("Exiting");
				break;

			}
		}

	}

}
