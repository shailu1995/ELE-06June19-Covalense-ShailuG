package com.covalense.javaapp.example;

public class Largest 
{
public static void main(String[] args)
{
	int a=20;
	int b=30;
	int c=0;
	if(a>b && a>c)
	{
		System.out.println("greatest is " + a);
	}
	else if (b>c)
	{
		System.out.println("greatest is " + b);
	}
	else
	{
		System.out.println("greatest is " + c);
	}
}
}
