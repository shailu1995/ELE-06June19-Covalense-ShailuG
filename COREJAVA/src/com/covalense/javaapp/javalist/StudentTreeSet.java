package com.covalense.collection.javalist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class StudentTreeSet {

	public static void main(String[] args) {

		TreeSet<Student> t = new TreeSet<Student>();

		Student s1 = new Student();
		s1.name = "SHAILU";
		s1.id = 12;
		s1.percentage = 95.8;

		Student s2 = new Student();
		s2.name = "SWATI";
		s2.id = 11;
		s2.percentage = 96.8;

		Student s3 = new Student();
		s3.name = "SANJU";
		s3.id = 10;
		s3.percentage = 94.8;

		Student s4 = new Student();
		s4.name = "GANDHI";
		s4.id = 9;
		s4.percentage = 93.8;

		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);

		System.out.println("FOR EACH LOOP OUTPUT ");
		for (Student r : t) {
			System.out.println("name of student is " + r.name);
			System.out.println("age of student is " + r.id);
			System.out.println("percentage of student is " + r.percentage);
		}

		System.out.println("Iterator OUTPUT ");
		Iterator<Student> it = t.iterator();
		while (it.hasNext()) {
			Student r = it.next();
			System.out.println("name of student is " + r.name);
			System.out.println("age of student is " + r.id);
			System.out.println("percentage of student is " + r.percentage);
		}

	}
}
