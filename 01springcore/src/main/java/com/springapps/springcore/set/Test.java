package com.springapps.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {

		// create the spring container- box
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springapps/springcore/set/config.xml");

		// get the cardealer bean from the container
		CarDealer cardealer = (CarDealer) context.getBean("cardealer");

		// print the bean
		System.out.println(cardealer);
		System.out.println(cardealer.getModels().getClass());
	}

}
