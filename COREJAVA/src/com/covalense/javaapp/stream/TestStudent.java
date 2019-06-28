package com.covalense.javaapp.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class TestStudent {

	static Comparator<Student> c = (a, b) -> {
		if (a.getPercentage() > b.getPercentage()) {
			return 1;

		} else if (a.getPercentage() < b.getPercentage()) {
			return -1;
		} else {
			return 0;
		}
	};

	static Student getTopper(ArrayList<Student> al) {
		return al.stream().max(c).get();
	}

	static Student getPopper(ArrayList<Student> al) {
		return al.stream().min(c).get();
	}

	public static void main(String[] args) {

		Student s1 = new Student("sneha", 23, 95.2);
		Student s2 = new Student("neha", 22, 45.2);
		Student s3 = new Student("sanju", 24, 63.2);
		Student s4 = new Student("swati", 25, 35.2);

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);

		Student s = getTopper(al);
		log.info("topper id" + s.getName() + "age " + s.getId() + "with percentage " + s.getPercentage());

		Student d = getPopper(al);
		log.info("topper id" + d.getName() + "age " + d.getId() + "with percentage " + d.getPercentage());
	}
}
