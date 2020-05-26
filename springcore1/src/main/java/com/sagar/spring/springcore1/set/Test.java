package com.sagar.spring.springcore1.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sagar/spring/springcore1/set/setconfig.xml");
		CarDealer carDealer = (CarDealer) context.getBean("carDealer");
		System.out.println("CarDealer Name: " + carDealer.getName());
		System.out.println("Car Models: " + carDealer.getModels());

	}

}
