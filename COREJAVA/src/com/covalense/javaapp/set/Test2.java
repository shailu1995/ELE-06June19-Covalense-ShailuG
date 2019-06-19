package com.covalense.javaapp.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test2 {

	public static void main(String[] args) {
		LinkedHashSet<Object> lih = new LinkedHashSet<Object>();
		lih.add("swati");
		lih.add(2.5);
		lih.add(58);
		lih.add('k');
		lih.add(null);
		
		System.out.println("FOR EACH LOOP OUTPUT ");
		for(Object r:lih) {
			System.out.println(r);
		}
		
		System.out.println("Iterator OUTPUT ");
		Iterator<Object> it= lih.iterator();
		while(it.hasNext()) {
			Object r= it.next();
			System.out.println(r);
		}
		

	}

}
