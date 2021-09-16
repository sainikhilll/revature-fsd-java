package com.revature.bankapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.bankapp.dao.TransactionDao;
import com.revature.bankapp.dao.Util;

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

}
