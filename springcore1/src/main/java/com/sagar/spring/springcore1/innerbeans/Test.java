package com.sagar.spring.springcore1.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sagar/spring/springcore1/innerbeans/employeeconfig.xml");
		Employee e1 = (Employee) context.getBean("employee");
		System.out.println(e1);
		
		Employee e2 = (Employee) context.getBean("employee");
		System.out.println(e2);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}

}
