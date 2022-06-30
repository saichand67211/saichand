package com.zensar.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.jdbc.Employee;
import com.zensar.services.ServiceImp;

public class Controller {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Application context loaded");
		ServiceImp serviceImp = context.getBean("service", ServiceImp.class);

		// CREATE STUDENT 
		Employee employee = new Employee();
		employee.setEmployeeId(104);
		employee.setEmployeeName("saichand");
		employee.setDesignation("CIO");
		employee.setAddress("Guntur");
		serviceImp.insert(employee);
		
	}

}
