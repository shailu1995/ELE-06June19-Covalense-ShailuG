package com.covalense.collection.javalist;

import java.util.Comparator;

public class EmployeeByName implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {
		if (o1.salary > o2.salary) {
			return 1;
		} else if (o1.salary < o2.salary) {
			return -1;
		} else {
			return 0;
		}
	}
}

/*
 * public int compare(Employee o1, Employee o2) { return
 * o1.name.compareTo(o2.name); }
 */

/* logic for id */
/*
 * public int compare(Employee o1,Employee o2) { if(o1.id > o2.id) { return 1; }
 * else if(o1.id < o2.id) { return -1; }else { return 0; }
 */
