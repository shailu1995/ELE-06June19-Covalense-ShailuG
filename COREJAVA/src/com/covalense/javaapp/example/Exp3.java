package com.covalense.javaapp.example;

public class Exp3 {

	public static void main(String[] args) {
		 int[]a={6,2,3,5,6}; 
		  int b[]={40,50,60,20,30}; 
		 System.arraycopy(a, 1, b, 0, 2);
		  
		  for( int j=0;j<b.length;j++) {
		  System.out.println(b[j]);
		  }
	}

}
