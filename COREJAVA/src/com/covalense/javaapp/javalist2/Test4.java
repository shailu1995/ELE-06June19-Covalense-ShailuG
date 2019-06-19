package com.covalense.javalist2;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test4 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(34);
		al.add("swati");
		al.add(null);
		al.add(3.2);
		al.add(null);
		
		ListIterator lit= al.listIterator();
		System.out.println("forward");
		while(lit.hasNext()){
			Object r=lit.next();
			System.out.println(r);
		};
		System.out.println("backward");

		while(lit.hasPrevious()){
			Object r=lit.previous();
			System.out.println(r);
		};
		
	}

}
