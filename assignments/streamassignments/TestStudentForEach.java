package com.covalense.javaapp.streamassignments;

import java.util.ArrayList;

import lombok.extern.java.Log;
@Log
public class TestStudentForEach {

	public static void main(String[] args) {
		Student s1 = new Student("Ram", 89, 1, 'M');
		Student s2 = new Student("Ramya", 32, 1, 'F');
		Student s3 = new Student("sam", 34, 1, 'M');
		Student s4 = new Student("siri", 89, 1, 'F');
		Student s5 = new Student("hari", 74, 1, 'M');
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		al.stream().forEach(i->log.info("Student details are: "+i));
	}

}
