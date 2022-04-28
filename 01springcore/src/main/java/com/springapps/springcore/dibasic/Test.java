package com.springapps.springcore.dibasic;

import java.security.DomainCombiner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		
		//create the bean container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springapps/springcore/dibasic/config.xml");
		
		//get the employee
		Employee emp = (Employee) context.getBean("emp");
		
		System.out.println(emp);
		
	}

}
