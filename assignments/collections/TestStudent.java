package com.covalense.javaapp.collections;

import java.util.ArrayList;
import java.util.logging.Logger;

public class TestStudent {

	private static final Logger log = Logger.getLogger("SHAILU");

	public static void main(String[] args) {
		ArrayList<Student> a = new ArrayList<Student>();
		Student p1 = new Student();
		p1.setName("SANJU");
		p1.setId(101);
		p1.setMarks(70);
		Student p4 = new Student();
		p4.setName("SAPNA");
		p4.setId(104);
		p4.setMarks(70);
		Student p2 = new Student();
		p2.setName("KAVYA");
		p2.setId(102);
		p2.setMarks(80);
		Student p3 = new Student();
		p3.setName("sahana");
		p3.setId(103);
		p3.setMarks(60);

		a.add(p1);
		a.add(p2);
		a.add(p3);
		for (Student p : a) {
			log.info("name=" + p.getName() + " ID=" + p.getId() + " marks=" + p.getMarks());
		}

	}
}
