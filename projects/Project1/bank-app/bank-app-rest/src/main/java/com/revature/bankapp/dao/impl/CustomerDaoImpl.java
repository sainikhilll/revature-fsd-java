package com.revature.bankapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.revature.bankapp.dao.CustomerDao;
import com.revature.bankapp.dao.Util;
import com.revature.bankapp.exception.AppException;
import com.revature.bankapp.model.Customer;

public class CustomerDaoImpl implements CustomerDao {
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerDaoImpl.class);

	public void create(Customer customer) throws AppException {
		LOGGER.info("Start");
		LOGGER.debug("{}", customer);
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
			LOGGER.info("End");
		}catch(SQLException e) {
			LOGGER.error("Error insering customer",e);
			throw new AppException(e);
		}

	}

	public Customer getCustomerByEmail(String email) throws AppException {
		LOGGER.info("Start");
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
				
			}LOGGER.info("End");
		}
		catch(SQLException e){
			LOGGER.error("Error insering customer",e);
			throw new AppException(e);
		}
		return customer;
	}
	
}
