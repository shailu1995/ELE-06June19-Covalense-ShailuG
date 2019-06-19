package com.covalense.javalist2;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
	
		ArrayList al=new ArrayList();
		
		al.add(309);
		al.add(7);
		al.add("gandhi");
		al.add(null);
		

		
		for(Object r:al) {
			System.out.println(r);
		}
	}

}
