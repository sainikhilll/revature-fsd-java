package com.revature.bankapp.dao.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.revature.bankapp.model.Transaction;

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
//	@Test
//	void test_success() {
//		TransactionDaoImpl dao = new TransactionDaoImpl();
//		
//		try {
//			dao.performWithdrawl(4, 6500);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	@Test
//	void test_DepositSuccess() {
//		TransactionDaoImpl dao  = new TransactionDaoImpl();
//		
//		try {
//			dao.performDeposit(5, 650);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//	
//	@Test
//	void test_AddTransactionSuccess() {
//		TransactionDaoImpl dao = new TransactionDaoImpl();
//		try {
//			dao.addTransaction(5, "withdrawl", 50000);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	@Test
	void test_ShowTransactionListSuccess() {
		TransactionDaoImpl dao = new TransactionDaoImpl();
		
		try {
			List<Transaction> trans = new ArrayList<>();
			trans = dao.showTransactions(3);
			
			trans.forEach(System.out::println);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
