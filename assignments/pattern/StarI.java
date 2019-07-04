package com.covalense.javaapp.pattern;
import java.util.Scanner;


public class StarI {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n=scan.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i==n/2 || j==n/2 || i==0 || j==0 || i+j==n-1 || i==n-1 || j==n-1 || i==j){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
				System.out.println(   );

			}
		
	}

}
