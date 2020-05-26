package com.sagar.spring.springcore1.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sagar/spring/springcore1/dependencycheck/prescriptionconfig.xml");
		Prescription p = (Prescription) context.getBean("prescription");
		System.out.println(p);

	}

}
 