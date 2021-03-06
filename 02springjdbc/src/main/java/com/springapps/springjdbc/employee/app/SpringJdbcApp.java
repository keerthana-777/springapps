package com.springapps.springjdbc.employee.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springapps.springjdbc.employee.dao.EmployeeDao;
import com.springapps.springjdbc.employee.dto.Employee;

public class SpringJdbcApp {
	
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springapps/springjdbc/employee/config/config.xml");
		EmployeeDao employeedao = (EmployeeDao) context.getBean("employeedao");
		
//		createEmployee(employeedao); 
//		updateEmployee(employeedao);
//		deleteEmployee(employeedao);
//		readEmployee(employeedao);
		readEmployees(employeedao);
		
	}




	private static void readEmployees(EmployeeDao employeedao) {
		List<Employee> emp = employeedao.read();
		System.out.println(emp);
		
	}




	private static void readEmployee(EmployeeDao employeedao) {
		Employee emp = employeedao.read(2);
		System.out.println(emp);
		
	}


//	private static void deleteEmployee(EmployeeDao employeedao) {
//		Employee emp= new Employee();
//		emp.setId(2);
//		employeedao.delete(emp);
//		
//	}


//	private static void updateEmployee(EmployeeDao employeedao) {
//		Employee emp= new Employee();
//		emp.setId(2);
//		emp.setFirstname("Bob");
//		emp.setLastname("Rider");
//		int result = employeedao.update(emp);
//		System.out.println("number of records inserted are: " + result);
//	}


//	private static void createEmployee(EmployeeDao employeedao) {
//		Employee emp= new Employee();
//		emp.setId(2);
//		emp.setFirstname("Max");
//		emp.setLastname("Rider");
//		int result = employeedao.update(emp);
//		System.out.println("number of records inserted are: " + result);
//	}

}
