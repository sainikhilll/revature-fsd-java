package com.revature.bankapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.bankapp.dao.CustomerDao;
import com.revature.bankapp.dao.Util;
import com.revature.bankapp.model.Customer;

public class CustomerDaoImpl implements CustomerDao {
	public void create(Customer customer) throws SQLException {
		try (Connection connection = Util.getConnection()) {
			//System.out.println(customer);
			String sql = "INSERT INTO customer (first_name, last_name, email, password) VALUES (?, ?, ?, ?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, customer.getFirstName());
			preparedStatement.setString(2, customer.getLastName());
			preparedStatement.setString(3, customer.getEmail());
			preparedStatement.setString(4, customer.getPassowrd());
			preparedStatement.executeUpdate();

			connection.close();
		}

	}

	public Customer getCustomerByEmail(String email) throws SQLException {
		Customer customer = null;
		try (Connection connection = Util.getConnection()) {
			String sql = "SELECT * FROM bank.customer where email= ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, email);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				String fn = resultSet.getString("first_name");
				String ln = resultSet.getString("last_name");
				String em = resultSet.getString("email");
				String psw = resultSet.getString("password");
				long id = resultSet.getInt("customer_id");
				customer = new Customer(fn, ln, em, psw);
				customer.setId(id);
				
			}
		}
		return customer;
	}
	
}
