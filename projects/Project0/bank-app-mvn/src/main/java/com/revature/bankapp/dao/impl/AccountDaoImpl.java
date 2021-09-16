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

public class AccountDaoImpl implements AccountDao {

	@Override
	public void create(Account account, long cust_id) throws SQLException {
		try (Connection connection = Util.getConnection()) {
			String sql = "INSERT INTO `account` (`cust_id`, `name`, `balance`) VALUES (?,?,?)";
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
			String sql = "select a.account_id, a.balance from customer c inner join account a on c.customer_id=a.cust_id";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next()) {
				Account account = new Account();
				account.setAccountId(rs.getInt("a.account_id"));
				account.setBalance(rs.getInt("a.balance"));
				
				accountList.add(account);
			}
		}
		return accountList;
	}
}