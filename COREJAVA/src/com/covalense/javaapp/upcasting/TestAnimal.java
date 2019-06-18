package com.covalense.javaapp.upcasting;

public class TestAnimal {
	public static void main(String[] args) {
		Animal a=new Cow();
		a.i=3;
		a.eat();
		System.out.println(a.i);
		//a.j=4;
	   // a.walk();----upcasting
		Cow c=(Cow)a;
		c.i=2;
		c.eat();
		c.j=6;
		c.walk();
		System.out.println(c.i);
		System.out.println(c.j);
	}

}
