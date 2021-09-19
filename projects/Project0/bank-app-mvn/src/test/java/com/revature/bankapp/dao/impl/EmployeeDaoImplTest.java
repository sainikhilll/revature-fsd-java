package com.revature.bankapp.dao.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.revature.bankapp.model.Customer;
import com.revature.bankapp.model.Transaction;

class EmployeeDaoImplTest {

//	@Test
//	void test() {
//		EmployeeDaoImpl dao = new EmployeeDaoImpl();
//		try {
//			ArrayList<Customer> custList = (ArrayList<Customer>) dao.showCustomerList();
//			custList.forEach(System.out::println);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	@Test
	void test_AccountDataRetirvalSuccess() {
		EmployeeDaoImpl dao = new EmployeeDaoImpl();
		try {
			ArrayList<Transaction> trans = (ArrayList<Transaction>) dao.showTransList(4);
			trans.forEach(System.out::println);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
