package com.revature.bankapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.bankapp.dao.AccountDao;
import com.revature.bankapp.dao.Util;
import com.revature.bankapp.model.Account;
//import com.revature.bankapp.model.DatabaseManager;

public class AccountDaoImpl implements AccountDao {

	@Override
	public void create(Account account, long cust_id) throws SQLException {
		try (Connection connection = Util.getConnection()) {
			String sql = "INSERT INTO account (cust_id, name, balance, approved) VALUES (?,?,?,'n')";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, (int)cust_id);
			preparedStatement.setString(2, account.getName());
			preparedStatement.setInt(3, (int)account.getBalance());
			preparedStatement.executeUpdate();

		}

	}

	@Override
	public List<Account> showAccounts() throws SQLException {
		List<Account> accountList = new ArrayList<>();
		try(Connection connection = Util.getConnection()){
		//	long cust = DatabaseManager.getCurrentCustomer().getId();
			long cust = 0;
			String sql = "select account_id, balance from account  where cust_id=(?) and approved = 'y'";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, (int)cust);
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next()) {
				Account account = new Account();
				account.setAccountId(rs.getInt("account_id"));
				account.setBalance(rs.getInt("balance"));
				
				accountList.add(account);
			}
		}
		return accountList;
	}
}