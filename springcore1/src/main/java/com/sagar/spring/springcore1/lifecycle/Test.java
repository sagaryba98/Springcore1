package com.sagar.spring.springcore1.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/sagar/spring/springcore1/lifecycle/LCconfig.xml");
		Patient p = (Patient) context.getBean("patient");
		System.out.println(p);

	}

}
