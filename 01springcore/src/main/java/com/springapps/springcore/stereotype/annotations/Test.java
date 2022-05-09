package com.springapps.springcore.stereotype.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// create the spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springapps/springcore/stereotype/annotations/config.xml");

		// get the hospital bean from the container
		Coach coach1 = (Coach) context.getBean("supercoach");
		
		// print the bean
		System.out.println(coach1);
//		System.out.println(coach1.hashCode());
//		
//		Coach coach2 = (Coach) context.getBean("supercoach");
//		System.out.println(coach2.hashCode());
//		
	}
}