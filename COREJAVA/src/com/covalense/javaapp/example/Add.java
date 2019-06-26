package com.covalense.javaapp.example;

public class Add
{
	static int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static void main(String[] args)
	{
		int i=sum(20,5);
		System.out.println(i);
	}

}
