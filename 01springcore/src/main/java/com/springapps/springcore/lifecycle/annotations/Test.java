package com.springapps.springcore.lifecycle.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {

		// create the spring container- box
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springapps/springcore/lifecycle/annotations/config.xml");
		context.registerShutdownHook();

		// get the customer bean from the container
		Patient patient = (Patient) context.getBean("patient");

		// print the bean
		System.out.println(patient);
	}

}
