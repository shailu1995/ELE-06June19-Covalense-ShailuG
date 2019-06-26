package com.covalense.javaapp.example;

public class Demo {

	public static void main(String[] args) 
	{
		Dog d=new Dog();
		d.cost=25000;
		d.colour="black";
		d.bark();
		System.out.println("cost of dog" + d.cost);
		System.out.println("colour of a dog" + d.colour);
	}

}
class Dog
{
	int cost;
	String colour;
	void bark()
	{
		
	}
	}