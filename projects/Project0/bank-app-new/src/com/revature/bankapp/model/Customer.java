package com.revature.bankapp.model;

public class Customer {
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private String passowrd;
	private static long counter = 0;
	public Customer(String firstName, String lastName, String email, String passowrd) {
		super();
		counter++;
		this.id = counter;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.passowrd = passowrd;
	}
	public String getPassowrd() {
		return passowrd;
	}
	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	
	
}
