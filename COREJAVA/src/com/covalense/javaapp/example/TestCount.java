package com.covalense.javaapp.example;

public class TestCount {

	public static void main(String[] args) {
		Count a=new Count();
		Count j=new Count();
		a.swipe();
		j.swipe();
		System.out.println("java count is" +j.c);
		System.out.println("angular count is"+a.c);
		System.out.println("oraganization count is" +Count.orgcount);
		
		

	}

}
