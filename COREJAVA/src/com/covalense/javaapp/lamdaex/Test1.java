package com.covalense.javaapp.lamdaex;


	
	interface Sum{
		int add(int a,int b);
	}
public class Test1 {
	public static void main(String[] args) {
		Sum s = (a,b)->a+b;
		
		int i=s.add(5, 8);
		System.out.println("sum is"+i);
		

	}

}
