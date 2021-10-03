package com.revature.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
	public static Connection getConnection() throws  SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("connection established");
		return DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/learndb"
				, "root"
				, "11716042");
	}
}
