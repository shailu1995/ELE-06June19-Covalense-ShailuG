package com.covalense.collection.javalist;

import java.util.ArrayList;

public class TestB {

	public static void main(String[] args) {
		
			
			ArrayList<Double> al = new ArrayList<Double>();
			al.add(9.4);
			al.add(1.5);
			al.add(6.9);
			al.add(2.4);
			al.add(3.6);
			
			System.out.println("Before----->"+al);
			
			
			al.add(2,2.5);
			
			
			
			System.out.println("After----->"+al);
		}


	}

