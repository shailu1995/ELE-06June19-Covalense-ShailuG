package com.covalense.javalist2;

import java.util.ArrayList;
import java.util.Iterator;
public class Test10 {
	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(3.4);
		al.add(2.5);
		al.add(5.2);
		al.add(3.2);
		al.add(2.47);
		
		Iterator<Double> it=al.iterator();
		while(it.hasNext()) {
			Object r=it.next();
			System.out.println(r);
		}
	
	}

}
