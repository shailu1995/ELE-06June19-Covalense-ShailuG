package com.covalense.javaapp.collections;

public class Employee {
	String name;
	int age;
	String designation;
	double salary;

	void set(String name, int age, String designation, double salary) {
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.salary = salary;

	}

	void get() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(designation);
		System.out.println(salary);
	}

}
