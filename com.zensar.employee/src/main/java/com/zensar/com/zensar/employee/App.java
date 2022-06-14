package com.zensar.com.zensar.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.beans.Employee;
import com.zensar.beans.Food;
import com.zensar.beans.Student;
import com.zensar.config.JavaConfiguration;

public class App 
{
    public static void main( String[] args )
    {
    	

    	public class App {
    		public static void main(String[] args) {

    			ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

    			Employee employee = (Employee) context.getBean("employeeOne");
    			
    			System.out.println(employee);

    		}
    }
}
