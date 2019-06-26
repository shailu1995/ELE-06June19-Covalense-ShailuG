package com.covalense.javaapp.example;

import java.util.Arrays;

public class Mouse {
	public static void main(String[] args) {
		int[] num= {2,5,67,8,6};
		
		
		Arrays.sort(num);
	
		
		for(int i=0;i<num.length;i++)
			System.out.println(num[i]); 
	}

}
