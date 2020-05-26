package com.sagar.spring.springcore1.lifecycle.Exercise;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/sagar/spring/springcore1/lifecycle/Exercise/ticketconfig.xml");
		TicketReservation t=(TicketReservation) context.getBean("ticket");
		context.registerShutdownHook();// to envoke the destroy method
		System.out.println(t);
		

	}

}
