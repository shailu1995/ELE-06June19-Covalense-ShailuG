package com.covalense.javaapp.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Test4 {

	public static void main(String[] args) {
		TreeSet<String> T = new TreeSet<String>();
		T.add("swati");
		T.add("mom");
		T.add("dad");
		T.add("bro");
		T.add("didu");
		
		System.out.println("FOR EACH LOOP OUTPUT ");
		for(String r:T) {
			System.out.println(r);
		}
		
		System.out.println("Iterator OUTPUT ");
		Iterator<String> it=T.iterator();
		while(it.hasNext()) {
			String r= it.next();
			System.out.println(r);
		}


	}

}
