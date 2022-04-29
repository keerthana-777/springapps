package com.springapps.springcore.dependencycheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {

		// create the spring container- box
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springapps/springcore/dependencycheck/config.xml");
		context.registerShutdownHook();

		// get the customer bean from the container
		Prescription prescription = (Prescription) context.getBean("prescription");

		// print the bean
		System.out.println(prescription);
	}

}
