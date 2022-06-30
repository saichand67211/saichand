package com.zensar.exception;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.zensar.jdbc.Employee;

public class EmployeException implements ResultSetExtractor<List<Employee>> {

		public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<Employee> employeeList = new ArrayList<Employee>();
			// TO EXTRACT THE STUDENT VALUES
			while(rs.next()) {
				Employee employee = new Employee();
				employee.setEmployeeId(rs.getInt("employeeId"));
				employee.setEmployeeName(rs.getString("employeeName"));
				employee.setDesignation(rs.getString("designation"));
				employee.setAddress(rs.getString("address"));
				
				employeeList.add(employee);
			}
			return employeeList;
		}


}
