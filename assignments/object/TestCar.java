package com.covalense.javaapp.object;

public class TestCar {

	public static void main(String[] args) 
		{
			Benz b=new Benz();
			Audi a1=new Audi();
			Driver d=new Driver();
			Parent p=new Parent();
			d.take(b);
			d.take(a1);
		}
}
