package com.covalense.javaapp.example;

public class Percentage 
{
	static double p(int a,int b) 
	{
		double c=(a*100)/b;
		return c;
	}
	public static void main(String[] args) 
	{
		double res=p(421,600);
		System.out.println(res);
	}
}
