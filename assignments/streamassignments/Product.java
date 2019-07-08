package com.covalense.javaapp.streamassignments;

public class Product {
	private String name;
	private double cost;
	private String brand;

	public Product(String name, double cost, String brand) {
		super();
		this.name = name;
		this.cost = cost;
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public String getBrand() {
		return brand;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", cost=" + cost + ", brand=" + brand + "]";
	}

}
