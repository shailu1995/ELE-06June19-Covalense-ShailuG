package com.covalense.javaapp.pattern;

public class StarC {


	public static void main(String[] args) {
		int j,i;
		for(i=1;i<5;i++){
			for(j=1;j<i;j++){
				System.out.print(" ");
			}
			for(j=1;j<5-i+1;j++){
				System.out.print("*");
			}
			System.out.println( );
		}
	}
}