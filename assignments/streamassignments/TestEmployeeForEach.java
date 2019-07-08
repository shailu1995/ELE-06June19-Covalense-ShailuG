package com.covalense.javaapp.streamassignments;

import java.util.ArrayList;

import lombok.extern.java.Log;
@Log
public class TestEmployeeForEach {

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
		
		al.stream().forEach(i->log.info("Employee details are: "+i));
	}

}
