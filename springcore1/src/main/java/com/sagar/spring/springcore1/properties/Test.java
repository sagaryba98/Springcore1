package com.sagar.spring.springcore1.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/sagar/spring/springcore1/properties/propertiesconfig.xml");
		CountriesAndLanguages c = (CountriesAndLanguages) context.getBean("countryAndLangs");
		System.out.println(c.getCountryAndLangs());
		
		System.out.println(c);

	}

}
