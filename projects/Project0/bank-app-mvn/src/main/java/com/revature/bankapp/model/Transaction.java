package com.revature.bankapp.model;

public class Transaction {
	private long id;
	private String type;
	private long money;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getMoney() {
		return money;
	}
	public void setMoney(long money) {
		this.money = money;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Transaction id = " + id + ", Type = " + type + ", Money = " + money ;
	}
	
	
	
	
	
	
}
