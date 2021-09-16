package com.revature.bankapp.dao.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.revature.bankapp.model.Account;

class AccountDaoImplTest {

	@Test
	void test() {
		AccountDaoImpl adao = new AccountDaoImpl();
		Account account = new Account();
		account.setBalance(6000);
		account.setName("venkat");
		try {
			adao.create(account,4);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	void test_Success() {
		AccountDaoImpl adao = new AccountDaoImpl();
		try {
			adao.showAccounts();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("failed getting account Details");
		}
	}

}
