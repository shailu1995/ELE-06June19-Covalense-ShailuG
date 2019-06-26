package com.covalense.javaapp.example;

public class Senier 
{
	public static void main(String[] args)
	{ 
	   
		int age=87;
		double ticket=100;
		double discount=15.4;
		if(age>=50)
		{
			ticket = ticket-(ticket*discount)/100;
		}
		System.out.print("he/she needs to paid" + ticket);
	}

}
