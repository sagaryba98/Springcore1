package com.sagar.spring.springcore1.refTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sagar/spring/springcore1/refTypes/refconfig.xml");
		Student s=(Student) context.getBean("students" );
		System.out.println(s);

	}

}
