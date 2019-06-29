package com.covalense.collection.javalist;


import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestJ {

	public static void main(String[] args) {
	
		Vector<Object> v = new Vector<Object>();
		v.add("swati");
		v.add(2.5);
		v.add(58);
		v.add('k');
		v.add(null);
			System.out.println("FOR LOOP OUTPUT ");
		for(int i=0;i<v.size();i++) {
			Object r=v.get(i);
			System.out.println(r);
		}
		
		System.out.println("FOR EACH LOOP OUTPUT ");
		for(Object r:v) {
			System.out.println(r);
		}
		
		System.out.println("Iterator OUTPUT ");
		Iterator<Object> it= v.iterator();
		while(it.hasNext()) {
			Object r= it.next();
			System.out.println(r);
		}
		
		
		System.out.println("ListIterator OUTPUT ");
		ListIterator<Object> lit = v.listIterator();
		while(lit.hasNext()) {
			Object r= lit.next();
			System.out.println(r);
		}
		
		System.out.println("enumeration");
		Enumeration<Object> e= v.elements();
		while(e.hasMoreElements()) {
			Object r= e.nextElement();
			System.out.println(r);
		}
		}


	}


