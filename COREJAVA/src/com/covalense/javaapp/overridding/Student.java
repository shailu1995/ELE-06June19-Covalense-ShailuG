package com.covalense.javaapp.overridding;

public class Student 
{
	String name;
	int age;
	double percentage;
	Student(String n,int a,double b)
	{
		name=n;
		age=a;
		percentage=b;
	}
	void display()
	{
		System.out.println("name is" +name);
		System.out.println("age is" +age);

		System.out.println("percentage is" +percentage);


	}

}
