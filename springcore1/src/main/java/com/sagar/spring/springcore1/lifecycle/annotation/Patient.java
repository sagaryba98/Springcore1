package com.sagar.spring.springcore1.lifecycle.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient  {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@PostConstruct
	public void hi() {
		System.out.println("Inside Hi method!");
	}
	@PreDestroy
	public void bye() {
		System.out.println("Inside Bye Method!");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	
	
	

}
