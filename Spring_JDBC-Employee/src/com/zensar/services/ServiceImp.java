package com.zensar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.jdbc.Employee;
@Repository("service")
public class ServiceImp implements Service{
	@Autowired
	private JdbcTemplate jdbcTemplate; // JDBCTEMPLATE CLASS

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insert(Employee employee) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO EMPLOYEE VALUE(?,?,?,?)";
		Object[] args = {employee.getEmployeeId(),employee.getEmployeeName(),employee.getDesignation(),employee.getAddress()};
		int noofRowsInserted = jdbcTemplate.update(sql,args);
		
	}

	@Override
	public void updateEmployee(int employeeId, String employeeName) {
		// TODO Auto-generated method stub
		String sql = "UPDATE employee SET employeeName=? WHERE employeeId=?";

		Object args[] = {employeeName, employeeId };

		int update = jdbcTemplate.update(sql, args);
		System.out.println("updated"+update);

		
	}

	@Override
	public void deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM employee WHERE employeeId=?";
		Object args[] = {employeeId};
		int delete = jdbcTemplate.update(sql, args);
		System.out.println("Deleted"+delete);

		
	}

}
