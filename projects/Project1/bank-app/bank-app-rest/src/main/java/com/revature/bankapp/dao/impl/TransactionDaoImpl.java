package com.revature.bankapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.bankapp.dao.TransactionDao;
import com.revature.bankapp.dao.Util;
import com.revature.bankapp.model.Transaction;

public class TransactionDaoImpl implements TransactionDao {

	@Override
	public void performWithdrawl(long accountId, long money) throws SQLException {
		try (Connection connection = Util.getConnection()) {

			String sql = "update bank.account set balance = ? where account_id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, (int) money);
			preparedStatement.setInt(2, (int) accountId);
			preparedStatement.executeUpdate();
			
			connection.close();

		}

	}

	@Override
	public void performDeposit(long accountId, long money) throws SQLException {
		try (Connection connection = Util.getConnection()) {

			String sql = "update bank.account set balance = ? where account_id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, (int) money);
			preparedStatement.setInt(2, (int) accountId);
			preparedStatement.executeUpdate();
			
			connection.close();

		}

	}

	@Override
	public long showBalance(long accountId) throws SQLException {
		long balanceReturned = 0;
		try (Connection connection = Util.getConnection()) {

			String sql = "select balance from account where account_id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,(int)accountId);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				balanceReturned = (long) rs.getInt("balance");
			}

		}
		return balanceReturned;

	}

	@Override
	public void addTransaction(long accountId, String type, long money) throws SQLException {
		try(Connection connection = Util.getConnection()){
			
			String sql = "INSERT INTO transaction (transaction_type, amount, account_id) VALUES (?, ?, ?)";
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, type);
			preparedStatement.setInt(2, (int) money);
			preparedStatement.setInt(3, (int) accountId);
			
			preparedStatement.executeUpdate();
			connection.close();
			
		}
	}

	@Override
	public List<Transaction> showTransactions(long accountId) throws SQLException {
		List<Transaction> transactionList = new ArrayList<>();
		
		
		try(Connection connection = Util.getConnection()){
			
			String sql = "select  transaction_id,transaction_type, amount from transaction where account_id = ?";
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, (int) accountId);
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next()) {
				Transaction transaction = new Transaction();
				transaction.setId(rs.getInt("transaction_id"));
				transaction.setType(rs.getString("transaction_type"));
				transaction.setMoney(rs.getInt("amount"));
				
				transactionList.add(transaction);
			}
		}
		
		return transactionList;
	}



}
