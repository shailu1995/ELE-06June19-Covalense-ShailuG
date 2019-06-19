package com.covalence.javalist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Test8 {

	public static void main(String[] args) {
		
			LinkedList<String> al = new LinkedList<String>();
			al.add("swati");
			al.add("gadmi");
			al.add("good");
			al.add("bidar");
			al.add("sweet");
			
			for(int i=0;i<al.size();i++) {
				String r=al.get(i);
				System.out.println(r);
			}
			for(String r:al) {
				System.out.println(r);
			}
			
			Iterator<String> it=al.iterator();
			while(it.hasNext()) {
				String r= it.next();
				System.out.println(r);
			}
			
			ListIterator<String> lit = al.listIterator();
			while(lit.hasNext()) {
				String r= lit.next();
				System.out.println(r);
			}
			
			
			
		}

	}


