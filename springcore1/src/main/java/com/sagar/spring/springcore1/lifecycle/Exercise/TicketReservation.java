package com.sagar.spring.springcore1.lifecycle.Exercise;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
	private int ticketNumber;

	public int getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	@Override
	public String toString() {
		return "TicketReservation [ticketNumber=" + ticketNumber + "]";
	}
	
	@PostConstruct
	public void initilize() {
		System.out.println("Inside the Initize method!");
	}
	@PreDestroy
	public void cleanUp() {
		System.out.println("Inside CleanUp method!");
	}
	

}
