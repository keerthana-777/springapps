package com.springapps.springcore.list;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		
		//create the bean container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springapps/springcore/list/config.xml");
		
		//get the employee
		Hospital hosp = (Hospital) context.getBean("hospital");
		
		System.out.println(hosp);
	}

}
