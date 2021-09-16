package com.revature.bankapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.revature.bankapp.dao.AccountDao;
import com.revature.bankapp.dao.Util;
import com.revature.bankapp.model.Account;

public class AccountDaoImpl implements AccountDao {

	@Override
	public void create(Account account, long cust_id) throws SQLException {
		try (Connection connection = Util.getConnection()) {
			String sql = "INSERT INTO `account` (`cust_id`, `name`, `balance`) VALUES (?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			 preparedStatement.setLong(1,cust_id);
			preparedStatement.setString(2, account.getName());
			preparedStatement.setLong(3, account.getBalance());

		}

	}
}