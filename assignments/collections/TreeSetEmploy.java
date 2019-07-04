package com.covalense.javaapp.collections;

import java.util.TreeSet;
import java.util.logging.Logger;

public class TreeSetEmploy {
	private static final Logger log = Logger.getLogger("shailu");

	void test(TreeSet<Employ> t) {

		Employ e1 = new Employ();
		e1.name = "sapna";
		e1.id = 1;
		e1.sal = 20000;

		Employ e2 = new Employ();
		e2.name = "sanju";
		e2.id = 2;
		e2.sal = 30000;

		Employ e3 = new Employ();
		e3.name = "sahana";
		e3.id = 3;
		e3.sal = 15000;

		Employ e4 = new Employ();
		e4.name = "rashmi";
		e4.id = 4;
		e4.sal = 50000;

		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);

		for (Employ e : t) {
			log.info("name=" + e.name + " id=" + e.id + " salary=" + e.sal);
		}

	}
}
