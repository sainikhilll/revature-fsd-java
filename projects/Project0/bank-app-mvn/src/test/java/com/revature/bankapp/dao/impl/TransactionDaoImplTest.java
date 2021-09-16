package com.revature.bankapp.dao.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

class TransactionDaoImplTest {

	@Test
	void test() {
		TransactionDaoImpl dao= new TransactionDaoImpl();
		try {
			dao.showBalance(4);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Not yet implemented");
		}
		
	}
	@Test
	void test_success() {
		TransactionDaoImpl dao = new TransactionDaoImpl();
		
		try {
			dao.performWithdrawl(4, 6500);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	void test_DepositSuccess() {
		TransactionDaoImpl dao  = new TransactionDaoImpl();
		
		try {
			dao.performDeposit(5, 650);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
