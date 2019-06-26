package com.covalense.javaapp.overridding;

public class Employ {
	String name;
	int id;
	int salary;

	Employ(String name, int id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	void display() {
		System.out.println("employe name is" + name);
		System.out.println("employe id is" + id);

		System.out.println("employe salary is" + salary);

	}
}
