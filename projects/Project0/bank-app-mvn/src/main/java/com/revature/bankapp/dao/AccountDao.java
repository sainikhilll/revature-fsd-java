package com.revature.bankapp.dao;

import java.sql.SQLException;

import com.revature.bankapp.model.Account;

public interface AccountDao {
	void create(Account account, long cust_id) throws SQLException;
}
