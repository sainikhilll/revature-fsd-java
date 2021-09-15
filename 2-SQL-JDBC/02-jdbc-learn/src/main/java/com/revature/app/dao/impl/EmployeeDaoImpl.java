package com.revature.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.app.dao.EmployeeDao;
import com.revature.app.dao.Util;
import com.revature.app.model.Department;
import com.revature.app.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public List<Employee> list() throws SQLException {
		List<Employee> employeeList = new ArrayList<>();
		try(Connection connection = Util.getConnection()){
			String sql = "select  *\r\n" + 
					"from employee e\r\n" + 
					"inner join department d\r\n" + 
					"on e.department_id = d.id\r\n";
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet =  statement.executeQuery();
		
			while(resultSet.next()) {
				Employee employee =new Employee();
				employee.setId(resultSet.getInt("id"));
				employee.setName(resultSet.getString("name"));
				employee.setSalary(resultSet.getDouble("salary"));
				employee.setGender(resultSet.getString("gender").charAt(0));
				Department department = new Department();
				department.setId(resultSet.getInt("d.id"));
				department.setName(resultSet.getString("d.name"));
				employee.setDepartment(department);
				employeeList.add(employee);
			}
			employeeList.forEach(System.out::println);
		}
		return employeeList;
	}

	@Override
	public Employee get(int id) throws SQLException {
		Employee employee = null;
		try(Connection connection = Util.getConnection()){
			String sql = "select  *\r\n" + 
					"from employee e\r\n" + 
					"inner join department d\r\n" + 
					"on e.department_id = d.id\r\n" +
					"where e.id = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1,id);
			ResultSet resultSet =  statement.executeQuery();
		
			while(resultSet.next()) {
				employee = new Employee();
				employee.setId(resultSet.getInt("id"));
				employee.setName(resultSet.getString("name"));
				employee.setSalary(resultSet.getDouble("salary"));
				employee.setGender(resultSet.getString("gender").charAt(0));
				Department department = new Department();
				department.setId(resultSet.getInt("d.id"));
				department.setName(resultSet.getString("d.name"));
				employee.setDepartment(department);
			}
			System.out.println(employee);
		}
		return employee;
	}

	@Override
	public void create(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
