package com.springapps.springcore.shopcart;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {

		// create the spring container- box
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springapps/springcore/shopcart/config.xml");

		// get the customer bean from the container
		ShoppingCart shoppingcart = (ShoppingCart) context.getBean("shoppingcart");

		// print the bean
		System.out.println(shoppingcart);
	}

}
