package com.covalense.javaapp.objectclass;

public class Student {
	private String name;
	private int a;

	public Student(String name, int a) {

		this.name = name;
		this.a = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getA() {
		return a;
	}

	public void setA1(int a) {
		this.a = a;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (a != other.a)
			return false;
		return true;
	}

	public void setA(int a) {
		this.a = a;
	}

}
