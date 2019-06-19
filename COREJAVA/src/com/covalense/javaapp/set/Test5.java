package com.covalense.javaapp.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Test5 {

	public static void main(String[] args) {
		TreeSet<Object> T = new TreeSet<Object>();
		T.add(22);
		T.add(25);
		T.add(58);
		T.add(44);
		T.add(25);
		
		System.out.println("FOR EACH LOOP OUTPUT ");
		for(Object r:T) {
			System.out.println(r);
		}
		
		System.out.println("Iterator OUTPUT ");
		Iterator<Object> it= T.iterator();
		while(it.hasNext()) {
			Object r= it.next();
			System.out.println(r);
		}

	}

}
