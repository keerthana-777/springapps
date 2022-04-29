package com.springapps.springcore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {

		// create the spring container- box
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springapps/springcore/reftypes/config.xml");

		// get the customer bean from the container
		Student student = (Student) context.getBean("student");

		// print the bean
		System.out.println(student);
	}

}
