package com.revature.bankapp.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.bankapp.model.Account;
import com.revature.bankapp.model.Customer;
import com.revature.bankapp.model.Transaction;

public interface EmployeeDao {
	public List<Customer>  showCustomerList() throws SQLException;
	public List<Transaction> showTransList(long accountId) throws SQLException;
	List<Account> getAccountsToVerify() throws SQLException;
	void approveAccount( long accountId) throws SQLException;
	void rejectAccount(long accountId) throws SQLException;
 }
