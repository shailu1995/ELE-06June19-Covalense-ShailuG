package com.covalense.javaapp.collections;

import java.util.TreeSet;
import java.util.logging.Logger;

public class TestEmploy {

	private static final Logger log = Logger.getLogger("shailu");

	public static void main(String[] args) {

		EmployById r = new EmployById();
		EmployBySalary s = new EmployBySalary();
		EmployByName n = new EmployByName();
		int key = 1;
		TreeSetEmploy p = new TreeSetEmploy();

		TreeSet<Employ> t;
		switch (key) {
		case 1:
			t = new TreeSet<Employ>(n);
			p.test(t);
			break;
		case 2:
			t = new TreeSet<Employ>(r);
			p.test(t);

			break;
		case 3:
			t = new TreeSet<Employ>(s);
			p.test(t);

			break;

		default:
			log.info("invalid number");
			break;
		}

	}

}
