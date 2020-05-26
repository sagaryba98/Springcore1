package com.sagar.spring.springcore1.dependencycheck.exercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sagar/spring/springcore1/dependencycheck/exercise/exerciseconfig.xml");
		University u=(University) context.getBean("university");
		System.out.println(u);
		
		University u1=(University) context.getBean("university");
		System.out.println(u1);
		
		System.out.println(u.hashCode());
		System.out.println(u1.hashCode());
		

	}
}
