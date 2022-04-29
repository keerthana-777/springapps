package com.springapps.springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {

		// create the spring container- box
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springapps/springcore/map/config.xml");

		// get the customer bean from the container
		Customer customer = (Customer) context.getBean("customer");

		// print the bean
		System.out.println(customer);
		System.out.println(customer.getProducts().getClass());
	}

}
