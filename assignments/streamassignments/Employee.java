package com.covalense.javaapp.streamassignments;

import lombok.Data;

@Data
public class Employee {

	private String name;
	private double salary;
	private double experience;
	private String designation;

	public Employee(String name, double salary, double d, String designation) {
		super();
		this.name = name;
		this.salary = salary;
		this.experience = d;
		this.designation = designation;
	}

	
}
