package com.sagar.spring.springcore1.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sagar/spring/springcore1/propertyplaceholder/serverconfig.xml");
		MyDAO d = (MyDAO) context.getBean("myDAO");
		System.out.println(d);

	}

}
