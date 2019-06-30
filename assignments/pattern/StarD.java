package com.covalense.javaapp.pattern;

public class StarD {


	public static void main(String[] args) {
		int i,j,k;
		for(i=0;i<=5;i++){
			for(k=0;k<=5-i+1;k++){
				System.out.print(" ");
			}
			for(j=1;j<=(2*i)-1;j++){
				System.out.print("*");
			}
			System.out.println( );
		}

	}

}
