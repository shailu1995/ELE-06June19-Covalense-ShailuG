package com.covalense.javaapp.stream;

public class Student {

	private String name;
	private int id;
	private double percentage;

	public Student(String name, int id, double percentage) {

		this.name = name;
		this.id = id;
		this.percentage = percentage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

}
