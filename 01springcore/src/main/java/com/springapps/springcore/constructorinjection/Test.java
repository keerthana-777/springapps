package com.springapps.springcore.constructorinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {

		// create the spring container- box
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springapps/springcore/constructorinjection/config.xml");
		context.registerShutdownHook();

		// get the customer bean from the container
		Address address = (Address) context.getBean("address");

		// print the bean
		System.out.println(address);
		System.out.println("1st object haschode = " + address.hashCode());
		
	}

}
