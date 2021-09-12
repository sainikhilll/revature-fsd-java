package com.revature.bankapp.model;

public class Account {
	private long id;
	private long accountNumber;
	private String name;
	private String branch;
	private long balance;
	private long counter = 55664;

	
	public Account( String name, String branch, long balance) {
		super();
		counter++;
		this.accountNumber = counter;
		this.name = name;
		this.branch = branch;
		this.balance = balance;
	}
	



	public long getAccountNumber() {
		return accountNumber;
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


	public long getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return  id + ")" + "Account Number=" + accountNumber + "\n Name=" + name + "\n branch=" + branch + "\n Balance="
				+ balance ;
	}
	

}
