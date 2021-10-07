package com.revature.bankapp.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.bankapp.exception.AppException;
import com.revature.bankapp.model.Account;

public interface AccountDao {
	void create(Account account, long cust_id) throws AppException;
	public List<Account> showAccounts(long cust_id) throws AppException;
}
