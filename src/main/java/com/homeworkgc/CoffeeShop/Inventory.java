package com.homeworkgc.CoffeeShop;

public class Inventory {
	
	private String name;
	private String description;
	private String quantity;
	private String price;
	
	public Inventory() {
		super();
	}

	
	public Inventory(String name, String description, String quantity, String price) {
		super();
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getQuantity() {
		return quantity;
	}


	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Inventory [name=" + name + ", description=" + description + ", quantity=" + quantity + ", price="
				+ price + "]";
	}

	
	
}
