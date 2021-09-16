package com.revature.bankapp.dao.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.revature.bankapp.model.Customer;

class CustomerDaoImplTest {

	@Test
	void test() {
		CustomerDaoImpl dao = new CustomerDaoImpl();
		Customer customer = new Customer("n","s","ss","22");
		try {
			dao.create(customer);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			fail ("Customer not created");
			e.printStackTrace();
		}
	}

}
