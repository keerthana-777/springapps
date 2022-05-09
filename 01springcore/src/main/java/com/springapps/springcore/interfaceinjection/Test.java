package com.springapps.springcore.interfaceinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// create the spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springapps/springcore/interfaceinjection/config.xml");

		// get the hospital bean from the container
		Coach coach = (Coach) context.getBean("coach");
		
		// print the bean
		System.out.println(coach);

	}
}