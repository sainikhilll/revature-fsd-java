package com.revature.bankapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.revature.bankapp.dao.AccountDao;
import com.revature.bankapp.dao.Util;
import com.revature.bankapp.exception.AppException;
import com.revature.bankapp.model.Account;
//import com.revature.bankapp.model.DatabaseManager;

public class AccountDaoImpl implements AccountDao {
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerDaoImpl.class);
	@Override
	public void create(Account account, long cust_id) throws AppException {
		try (Connection connection = Util.getConnection()) {
			String sql = "INSERT INTO account (cust_id, name, balance, approved) VALUES (?,?,?,'y')";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, (int)cust_id);
			preparedStatement.setString(2, account.getName());
			preparedStatement.setInt(3, (int)account.getBalance());
			preparedStatement.executeUpdate();

		}
		catch(SQLException e){
			LOGGER.error("Inserting account details");
			throw new AppException(e);
		}

	}

	@Override
	public List<Account> showAccounts(long cust) throws AppException {
		LOGGER.info("Show Accounts called");
		List<Account> accountList = new ArrayList<>();
		try(Connection connection = Util.getConnection()){
		//	long cust = DatabaseManager.getCurrentCustomer().getId();
			
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
		}catch(SQLException e) {
			LOGGER.error("Getting Customer Details",e);
			throw new AppException(e);
		}
		return accountList;
	}
}