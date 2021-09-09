package com.revature.bankapp.model;

public class Customer {
	
	private String mailId;
	private String password;
	private String name;
	public Customer() {}
	public Customer(String mailId, String password, String name) {
		super();
		this.mailId = mailId;
		this.password = password;
		this.name = name;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		
	}

	@Override
	public String toString() {
		return "Customer [mailId=" + mailId + ", password=" + password + ", name=" + name + "]";
	}
	
}
