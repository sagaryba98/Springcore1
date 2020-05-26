package com.sagar.spring.springcore1.setterInjectionExercise;

public class ShoppingCart {

	private Item items;

	public Item getItems() {
		return items;
	}

	public void setItems(Item items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "ShoppingCart [iteams=" + items + "]";
	}
	
	
	
}
