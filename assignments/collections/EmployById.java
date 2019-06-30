package com.covalense.javaapp.collections;

import java.util.Comparator;

public class EmployById implements Comparator<Employ> {

	@Override
	public int compare(Employ o1, Employ o2) {
		if (o1.id > o2.id) {
			return 1;
		} else if (o1.id < o2.id) {
			return -1;
		} else {
			return 0;
		}
	}

}
