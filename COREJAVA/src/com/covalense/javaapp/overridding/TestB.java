package com.covalense.javaapp.overridding;

public class TestB {

	public static void main(String[] args) {
		Student s = new Student("shweta", 23, 56);
		Student s2 = new Student("swati", 22, 96);
		
		Student s1 = new Student("sneha", 13, 76);
		s.display();
		System.out.println("********************************");
		s1.display();
		System.out.println("********************************");
		s2.display();
	}

}
