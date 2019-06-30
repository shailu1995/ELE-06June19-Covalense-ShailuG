package com.covalense.javaapp.collections;

import java.util.Comparator;

public class EmployBySalary implements Comparator<Employ> {

	@Override
	public int compare(Employ o1, Employ o2) {
		if (o1.sal > o2.sal) {
			return 1;
		} else if (o1.sal < o2.sal) {
			return -1;
		} else {
			return 0;
		}
	}

}
