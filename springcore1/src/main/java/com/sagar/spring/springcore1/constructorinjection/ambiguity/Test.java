package com.sagar.spring.springcore1.constructorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sagar/spring/springcore1/constructorinjection/ambiguity/additionconfig.xml");

		Addition e= (Addition) context.getBean("addition");
		System.out.println(e);
		
	
	}

}
