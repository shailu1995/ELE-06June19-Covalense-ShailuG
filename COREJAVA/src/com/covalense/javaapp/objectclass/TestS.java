package com.covalense.javaapp.objectclass;

public class TestS {
	public static void main(String[] args) {
		Student a = new Student("swati", 22);

		Student b = new Student("swati", 22);

		System.out.println(a.equals(b));

	}
}
