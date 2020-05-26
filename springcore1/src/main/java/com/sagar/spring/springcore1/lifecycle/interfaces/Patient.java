package com.sagar.spring.springcore1.lifecycle.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void hi() {
		System.out.println("Inside Hi method!");
	}
	
	public void bye() {
		System.out.println("Inside Bye Method!");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterPropertiesSet!");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside Destroy method!");
		
	}
	
	

}
