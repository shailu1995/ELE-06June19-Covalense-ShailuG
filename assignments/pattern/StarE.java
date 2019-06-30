package com.covalense.javaapp.pattern;

public class StarE {
	public static void main(String[] args) {
		int i,k,j;
		for(i=1;i<=4;i++){
			for(j=1;j<=3-i+1;j++){
				System.out.print(" ");
				}
			for(k=1;k<=i;k++){
				System.out.print("*");
				}
			System.out.println(  );
			}
		for(i=2;i<=5;i++){
			for(j=1;j<i;j++){
				System.out.print(" ");
		}	
		for(k=1;k<=4-i+1;k++){
			System.out.print("*");
		}	
		System.out.println(  );
	}
	}
}


