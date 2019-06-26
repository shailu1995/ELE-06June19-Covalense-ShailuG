package com.covalense.javaapp.example;

public class Multiplication
{
	static int mul(int a,int b)
	{
		int c=a*b;
		return c;
	}
	public static void main(String[] args)
	{
		int i=mul(2,5);
		System.out.println(i);
	}
}
