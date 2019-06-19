package com.covalense.javalist2;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test9 {

	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(3.4);
		al.add(2.66);
		al.add(1.555);
		al.add(3.2);
		al.add(2.999);
		
		ListIterator<Double> lit= al.listIterator(al.size());
		
		while(lit.hasPrevious()){
			Double r=lit.previous();
			System.out.println(r);
		};
	}

}
