package com.revature.bankapp.model;

public class Transaction {
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
	@Override
	public String toString() {
		return "Type =  " + type + ", Money =  " + money ;
	}
	
	
	
	
	
	
}
