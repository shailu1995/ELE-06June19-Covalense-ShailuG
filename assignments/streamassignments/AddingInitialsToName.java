package com.covalense.javaapp.streamassignments;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class AddingInitialsToName {
	public static void main(String[] args) {
		Student s1 = new Student("Ram", 92, 1, 'M');
		Student s2 = new Student("Ramya", 84, 2, 'F');
		Student s3 = new Student("Sam", 32, 3, 'M');
		Student s4 = new Student("Rani", 86, 4, 'F');
		Student s5 = new Student("Siri", 74, 5, 'F');

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);

		Function<Student, Student> f = i -> {
			if (i.getGender() == 'M') {
				return new Student("Mr." + i.getName(), i.getPercentage(), i.getRollNo(), i.getGender());
			} else if (i.getGender() == 'F') {
				return new Student("Miss." + i.getName(), i.getPercentage(), i.getRollNo(), i.getGender());
			}
			return null;

		};

		List<Student> list = al.stream().map(f).collect(Collectors.toList());
		for (Student string : list) {
			log.info("New Details Are: "+string);
		}
	}
}