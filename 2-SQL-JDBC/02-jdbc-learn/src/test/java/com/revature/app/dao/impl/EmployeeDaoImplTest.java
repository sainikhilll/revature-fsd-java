package com.revature.app.dao.impl;

import static org.junit.jupiter.api.Assertions.*;


import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.revature.app.dao.EmployeeDao;
import com.revature.app.model.Employee;

class EmployeeDaoImplTest {

	@Test
	void test() {
		EmployeeDao dao = new EmployeeDaoImpl();
		try {
			assertTrue(dao.list().size() > 0);
		} catch (SQLException e) {
			fail("getting Employee List Failed");
		}
	}
	@Test
	void testGet_Success() {
		EmployeeDao dao = new EmployeeDaoImpl();
		try {
			Employee employee = dao.get(1);
			assertEquals(1,employee.getId(),"Incorrect user returned");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
