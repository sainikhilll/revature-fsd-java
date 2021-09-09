package com.revature.bankapp.main;

public class Account {
	private long id;
	private long accountNumber;
	private String name;
	private String branch;
	private int balance;
	
	public Account(long id, long accountNumber, String name, String branch, int balance) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.name = name;
		this.branch = branch;
		this.balance = balance;
	}
	

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public long getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public static void main(String[] args) {
		Account account = new Account(100,123456789,"john","tirupathi",5000);
		System.out.println(account.id);
	}

}
