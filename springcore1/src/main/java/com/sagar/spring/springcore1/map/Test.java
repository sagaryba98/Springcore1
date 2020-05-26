package com.sagar.spring.springcore1.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sagar/spring/springcore1/map/mapconfig.xml");
		Customer customer = (Customer) context.getBean("customer");
		System.out.println("Customer ID: " + customer.getId());
		System.out.println("Customers Products: " + customer.getProducts());
		System.out.println(customer);

	}

}
