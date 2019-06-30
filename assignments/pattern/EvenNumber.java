package com.covalense.javaapp.pattern;


public class EvenNumber {
	
	public static void main(String args[]) {
		System.out.println("Divided by 5: ");		
		for (int i=50; i<100; i++) {
			if (i%5==0 && i%2==0) 
			System.out.println(i +" ");			
		}	
	}
}
