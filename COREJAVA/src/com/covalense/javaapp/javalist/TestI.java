package com.covalense.collection.javalist;


import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestI {

	public static void main(String[] args) {
	
			Vector<Double> v = new Vector<Double>();
			v.add(9.4);
			v.add(1.5);
			v.add(6.9);
			v.add(2.4);
			v.add(3.6);
			
			System.out.println("FOR LOOP OUTPUT ");
			for(int i=0;i<v.size();i++) {
				Double r=v.get(i);
				System.out.println(r);
			}
			
			System.out.println("FOR EACH LOOP OUTPUT ");
			for(Double r:v) {
				System.out.println(r);
			}
			
			System.out.println("Iterator OUTPUT ");
			Iterator<Double> it= v.iterator();
			while(it.hasNext()) {
				Double r= it.next();
				System.out.println(r);
			}
			
			System.out.println("ListIterator OUTPUT ");
			ListIterator<Double> lit = v.listIterator();
			while(lit.hasNext()) {
				Double r= lit.next();
				System.out.println(r);
			}
			
			System.out.println("enumeration");
			Enumeration<Double> e=v.elements();
			while(e.hasMoreElements()) {
				Double r= e.nextElement();
				System.out.println(r);
			}
			
		}


	}


