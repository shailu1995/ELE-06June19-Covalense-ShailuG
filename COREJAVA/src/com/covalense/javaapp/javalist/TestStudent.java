package com.covalense.collection.javalist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestStudent {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();

		Student s1 = new Student();
		s1.name = "shailU";
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

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);

		System.out.println("for loop***********");

		for (int i = 0; i < al.size(); i++) {
			Student s = al.get(i);
			System.out.println("name of student is " + s.name);
			System.out.println("age of student is " + s.id);
			System.out.println("percentage of student is " + s.percentage);

		}
		System.out.println("foreach loop***********");
		for (Student s : al) {
			System.out.println("name of student is " + s.name);
			System.out.println("age of student is " + s.id);
			System.out.println("percentage of student is " + s.percentage);

		}

		System.out.println("iterator loop***********");
		Iterator<Student> it = al.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("name of student is " + s.name);
			System.out.println("age of student is " + s.id);
			System.out.println("percentage of student is " + s.percentage);
		}

		System.out.println("listiterator loop***********");

		ListIterator<Student> lit = al.listIterator();
		while (lit.hasNext()) {
			Student s = lit.next();
			System.out.println("name of student is " + s.name);
			System.out.println("age of student is " + s.id);
			System.out.println("percentage of student is " + s.percentage);
		}

	}

}
