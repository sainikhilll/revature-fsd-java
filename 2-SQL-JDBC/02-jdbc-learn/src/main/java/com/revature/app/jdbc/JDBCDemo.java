package com.revature.app.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/learndb"
					, "root"
					, "11716042");
			System.out.println(connection.getClass().getName());
			System.out.println("Connection Established successfully");
			String sql = "insert into department (name) values ('Innovation')";
			Statement statement = connection.createStatement();
			statement.executeUpdate(sql);
			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
