package com.covalense.collection.javalist;

import java.util.ArrayList;

public class TestF {

	public static void main(String[] args) {
		
			ArrayList<Double> al = new ArrayList<Double>();
			al.add(9.4);
			al.add(1.5);
			al.add(6.9);
			al.add(2.4);
			al.add(3.6);
			
			ArrayList<Double> b1 = new ArrayList<Double>();
			b1.add(3.6);
			b1.add(6.2);
			
			//al.addAll(b1);
			
			System.out.println("Before----->"+al);
			al.addAll(b1);
			
			
			
			
			
			System.out.println("After----->"+al);
		}


	}

