package com.covalense.javaapp.streamassignments;

import lombok.Data;

@Data
public class Student {

	private String name;
	private double percentage;
	private int rollNo;
	private char gender;

	public Student(String name, double percentage, int rollNo, char gender) {
		super();
		this.name = name;
		this.percentage = percentage;
		this.rollNo = rollNo;
		this.gender = gender;
	}

}
