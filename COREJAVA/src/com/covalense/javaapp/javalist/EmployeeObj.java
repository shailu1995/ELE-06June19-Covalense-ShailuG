package com.covalense.collection.javalist;

import java.util.TreeSet;

public class EmployeeObj {

	public static void main(String[] args) {
		EmployeeByName emp = new EmployeeByName();
		TreeSet<Employee> t = new TreeSet<Employee>(emp);

		Employee e1 = new Employee();
		e1.name = "SHAILU";
		e1.id = 12;
		e1.salary = 6000;

		Employee e2 = new Employee();
		e2.name = "SWATI";
		e2.id = 11;
		e2.salary = 8000;

		Employee e3 = new Employee();
		e3.name = "SANJU";
		e3.id = 10;
		e3.salary = 7000;

		Employee e4 = new Employee();
		e4.name = "GANDHI";
		e4.id = 9;
		e4.salary = 9000;

		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);

		System.out.println("FOR EACH LOOP OUTPUT ");
		for (Employee r : t) {
			System.out.println("name of Employee is " + r.name);
			System.out.println("id of Employee is " + r.id);
			System.out.println("salary of Employee is " + r.salary);
		}

	}

}
