package com.covalense.javaapp.streamassignments;

import java.util.ArrayList;
import java.util.Comparator;

import lombok.extern.java.Log;

@Log
public class TestStudentSort {

	public static void main(String[] args) {

		Student s1 = new Student("ram", 92, 1, 'M');
		Student s2 = new Student("ramya", 32, 5, 'F');
		Student s3 = new Student("sam", 85, 4, 'M');
		Student s4 = new Student("samla", 92, 3, 'F');
		Student s5 = new Student("ramu", 79, 2, 'M');

		ArrayList<Student> al = new ArrayList<Student>();

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);

		Comparator<Student> c = (i, j) -> {
			if (i.getRollNo() > j.getRollNo()) {
				return 1;
			} else if (i.getRollNo() < j.getRollNo()) {
				return -1;
			} else {
				return 0;
			}
		};
		
		log.info("Students sorted according to rollNo: ");
		al.stream().sorted(c).forEach(i -> log.info("" + i));

	}

}
