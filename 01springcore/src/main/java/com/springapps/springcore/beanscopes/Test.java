package com.springapps.springcore.beanscopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {

		// create the spring container- box
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springapps/springcore/beanscopes/config.xml");
		context.registerShutdownHook();

		// get the customer bean from the container
		Address address = (Address) context.getBean("address");

		// print the bean
		System.out.println(address);
		System.out.println("1st object haschode = " + address.hashCode());
		
		Address address2 = (Address) context.getBean("address");
		System.out.println("2nd object haschode = " + address2.hashCode());
		
		Address address3 = (Address) context.getBean("address");
		System.out.println("3rd object haschode = " + address3.hashCode());
	}

}
