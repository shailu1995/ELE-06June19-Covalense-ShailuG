package com.covalense.collection.javalist;

import java.util.ArrayList;

public class TestC {

	public static void main(String[] args) {
		
			
			ArrayList<Double> al = new ArrayList<Double>();
			al.add(9.4);
			al.add(1.5);
			al.add(6.9);
			al.add(2.4);
			al.add(3.6);
			
			System.out.println("Before----->"+al);
			
			Double res= al.set(2, 25.34);
			System.out.println("removed object is " +res);
			
			
			
			
			System.out.println("After----->"+al);
		}


	}


