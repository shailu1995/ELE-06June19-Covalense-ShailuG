package com.covalense.javaapp.implamda;

import java.util.Comparator;
import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class TestEmployee {

	public static void main(String[] args) {

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

		Comparator<Employee> c = (e, f) -> {
			if (e.id > f.id) {
				return 1;
			} else if (e.id < f.id) {
				return -1;
			} else {
				return 0;
			}
		};

		TreeSet<Employee> ts = new TreeSet<Employee>(c);

		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);

		log.info("FOR EACH LOOP OUTPUT ");
		for (Employee e : ts) {
			System.out.println("name of Employee is " + e.name);
			System.out.println("id of Employee is " + e.id);
			System.out.println("salary of Employee is " + e.salary);
		}
	}
}