package com.revature.bankapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.bankapp.dao.EmployeeDao;
import com.revature.bankapp.dao.Util;
import com.revature.bankapp.exception.AppException;
import com.revature.bankapp.model.Account;
import com.revature.bankapp.model.Customer;
import com.revature.bankapp.model.Transaction;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public List<Customer> showCustomerList() throws AppException {
		List<Customer> custList = new ArrayList<>();
		try (Connection connection = Util.getConnection()) {
			String sql = "select c.customer_id , c.first_name, c.last_name, a.account_id ,a.balance from customer c inner join account a where c.customer_id = a.cust_id";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				Customer customer = new Customer();
				customer.setId(rs.getInt("c.customer_id"));
				customer.setFirstName(rs.getString("c.first_name"));
				customer.setLastName(rs.getString("c.last_name"));

				Account account = new Account();
				account.setAccountId(rs.getInt("a.account_id"));
				account.setBalance(rs.getInt("a.balance"));

				customer.setAccount(account);
				custList.add(customer);

			}
		}catch(SQLException e) {
			
			throw new AppException(e);
		}
		return custList;
	}

	@Override
	public List<Transaction> showTransList(long accountId) throws AppException {
		List<Transaction> transList = new ArrayList<>();
		try (Connection connection = Util.getConnection()) {
			String sql = "select transaction_id,transaction_type,amount from transaction where account_id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, (int) accountId);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				Transaction transaction = new Transaction();
				transaction.setId(rs.getInt("transaction_id"));
				transaction.setType(rs.getString("transaction_type"));
				transaction.setMoney(rs.getInt("amount"));

				transList.add(transaction);
			}
		}catch(SQLException e) {
			throw new AppException(e);
		}
		return transList;
	}

	@Override
	public void approveAccount(long accountId) throws SQLException {
		try (Connection connection = Util.getConnection()) {
			String sql = "update account  set approved = 'y' where account_id= ? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, (int) accountId);
			preparedStatement.executeUpdate();

			connection.close();
		}

	}

	@Override
	public void rejectAccount(long accountId) throws SQLException {
		try (Connection connection = Util.getConnection()) {
			String sql = "update account  set approved = 'r' where account_id= ? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, (int) accountId);
			preparedStatement.executeUpdate();

		}
	}

	@Override
	public List<Account> getAccountsToVerify() throws SQLException {
		List<Account> accountListToVerify = new ArrayList<>();
		try(Connection connection = Util.getConnection()){
			String sql = "select account_id,name,balance,approved from account where approved = 'n'";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next()) {
				Account account = new Account();
				account.setAccountId(rs.getInt("account_id"));
				account.setName(rs.getString("name"));
				account.setBalance(rs.getInt("balance"));
				
				accountListToVerify.add(account);
			}
		}
		return accountListToVerify;
	}

}
