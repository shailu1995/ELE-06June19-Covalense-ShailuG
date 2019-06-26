package com.covalense.javaapp.example;

public class Factorial 
{
 static int fact(int x)
{
	if (x==0)
	{
		return 1;
	}
	return x*fact(x-1);
}
public static void main(String[] args)
{
	int i=fact(5);
	System.out.println(i);
	
}
}
