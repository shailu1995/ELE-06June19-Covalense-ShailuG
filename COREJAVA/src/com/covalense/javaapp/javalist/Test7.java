package com.covalence.javalist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Test7 {

	public static void main(String[] args) {
	
			LinkedList<Double> al = new LinkedList<Double>();
			al.add(9.4);
			al.add(1.5);
			al.add(6.9);
			al.add(2.4);
			al.add(3.6);
			
			for(int i=0;i<al.size();i++) {
				Object r=al.get(i);
				System.out.println(r);
			}
			
			for(Object r:al) {
				System.out.println(r);
			}
			
			Iterator it=al.iterator();
			while(it.hasNext()) {
				Object r=it.next();
				System.out.println(r);
			}
			
			ListIterator lit = al.listIterator();
			while(it.hasNext()) {
				Object r=lit.next();
				System.out.println(r);
			}
			
			}
	}
