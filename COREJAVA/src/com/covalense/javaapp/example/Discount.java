package com.covalense.javaapp.example;

public class Discount 
{
	public static void main(String[] args)
	{
		double price=200;
		double discount=15.4;
		int visitCount=1;
		if(visitCount>=50)
		{
			price=price-(price*discount)/100;	}
		System.out.println(price+"need to be paid");
	}
}
