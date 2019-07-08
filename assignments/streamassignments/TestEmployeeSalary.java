package com.covalense.javaapp.streamassignments;

import java.util.ArrayList;
import java.util.Comparator;

import lombok.extern.java.Log;

@Log
public class TestEmployeeSalary {

	static Comparator<Employee> c = (i, j) -> {
		if (i.getSalary() > j.getSalary()) {
			return 1;
		} else if (i.getSalary() < j.getSalary()) {
			return -1;
		} else {
			return 0;
		}
	};

	static Employee getEmployeeWithHighestSalary(ArrayList<Employee> al) {

		return al.stream().max(c).get();

	}

	static Employee getEmployeeWithLeastSalary(ArrayList<Employee> al) {

		return al.stream().min(c).get();

	}

	public static void main(String[] args) {

		Employee emp1 = new Employee("Ram", 35000, 3, "Software Engineer");
		Employee emp2 = new Employee("Ramya", 23000, 1.5, "Web Developer");
		Employee emp3 = new Employee("Sam", 15000, 1, "Software Engineer");
		Employee emp4 = new Employee("Siri", 24000, 1.8, "Test Engineer");
		Employee emp5 = new Employee("Hari", 25000, 2.5, "Software Engineer");

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		al.add(emp4);
		al.add(emp5);
		Employee highest = TestEmployeeSalary.getEmployeeWithHighestSalary(al);
		log.info("Employee " + highest.getName() + " is getting Highest salary " + highest.getSalary());

		Employee lowest = TestEmployeeSalary.getEmployeeWithLeastSalary(al);
		log.info("Employee is " + lowest.getName() + " is getting Lowest salary " + lowest.getSalary());
	}

}
