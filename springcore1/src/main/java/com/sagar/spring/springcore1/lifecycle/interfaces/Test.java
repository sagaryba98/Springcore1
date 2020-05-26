package com.sagar.spring.springcore1.lifecycle.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sagar/spring/springcore1/lifecycle/interfaces/LCconfig.xml");
		Patient p = (Patient) context.getBean("patient");
		System.out.println(p);
		context.registerShutdownHook();

	}

}
