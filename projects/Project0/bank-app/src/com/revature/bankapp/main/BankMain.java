package com.revature.bankapp.main;

import java.util.Scanner;

import com.revature.bankapp.data.DataManager;
import com.revature.bankapp.model.Customer;

public class BankMain {
	public static void collectingDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter email id");
		String mailId = scanner.nextLine();
		System.out.print("SetUp Password");
		String password = scanner.nextLine();
		System.out.print("Enter Name");
		String name = scanner.nextLine();
		
		DataManager.customerDetailsList.add(new Customer(mailId, password, name));
		//new Customer(mailId, password, name);
		System.out.println(DataManager.customerDetailsList.get(0).getMailId());
	}
//	public static void main(String[] args) {
//		collectingDetails();
//		//System.out.println(DataManager.customerDetailsList);
//		System.out.println(DataManager.customerDetailsList);
//	}
}
