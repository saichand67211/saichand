package com.zensar.services;

import com.zensar.jdbc.Employee;

public interface Service {
	void insert(Employee employee);
	void updateEmployee(int employeeId,String employeeName);
	void deleteEmployee(int employeeId);

}
