package com.covalense.javaapp.overridding;

public class Train 
{
	void search(int i)
	{
		System.out.println("2356444");
	}
	void search(String a)
	{
		System.out.println("basava express");
	}
	void search(int b,String c)
	{
		System.out.println("chennai express");
	}
	public static void main(String[] args) 
	{
		Train t=new Train();
		t.search(2,"shai");
	}
}
//ex for method overloading
