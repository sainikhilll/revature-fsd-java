package com.revature.app.bank;

import java.util.Scanner;

public class CustomerLogin {
	private static String loginID;
	private static String password;

	public static boolean authentication(String iD, String pd) {
		if (iD.equals("john") && pd.equals("1111")) {
			return true;
		} else {
			return false;
		}
	}
	public static void diaplayCutsomerMenuAndAuthentication() {
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.print("LoginID : ");
		loginID = scanner.nextLine();
		System.out.print("Password : ");
		password = scanner.nextLine();
		boolean flag = authentication(loginID, password);
		if (flag == true) {
			System.out.println();
			System.out.println("Login Successful");
			CustomerMenu customerMenu = new CustomerMenu();
			System.out.println();
			customerMenu.displayCustomerActionoptions();
			
		} else {
			System.out.println("Enter Valid Credentials");
		}

	}
	

	public static void main(String[] args) {
		
		
	}

}
