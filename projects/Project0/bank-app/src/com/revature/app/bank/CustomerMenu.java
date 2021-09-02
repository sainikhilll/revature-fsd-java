package com.revature.app.bank;

import java.util.Scanner;

public class CustomerMenu {
	public static void displayCustomerMenu() {
		System.out.println("========================");
		System.out.println("    Customer Menu   ");
		System.out.println("========================");
		System.out.println("1. Create New Account");
		System.out.println("2. Logout");
	}

	public static void displayCustomerActionoptions() {
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		while (choice != 2) {
			displayCustomerMenu();
			System.out.print("Enter your choice : ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Creating New Account, Thanks for choosing our Bank");
				break;
			case 2:
				System.out.println("Logging out");
				break;
			default:
				System.out.println("Enter valid choice");
				break;
			}
		}
	}

	public static void main(String[] args) {

	}

}
