package com.covalense.javaapp.casting;

public class TestAnimal {
	public static void main(String[] args) {
		Animal a=new Cow();
		
		//a.i=3;
		//a.eat();
		//a.j=4;
	    //a.walk();
		//System.out.println(a.i);
		//System.out.println(a.j);
		
		Cow c=(Cow)a;
		c.i=2;
		c.eat();
		c.j=6;
		c.walk();
		System.out.println(c.i);
		System.out.println(c.j);
	}

}
