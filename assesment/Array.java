package com.covalense.corejava.assessment;

import java.util.ArrayList;
import java.util.Comparator;

import lombok.extern.java.Log;

@Log
public class Array {
	public static void main(String[] args) {

		Array[] a = new Array[4];
		Array[] b = new Array[4];
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(50);
		al.add(60);

		ArrayList<Integer> all = new ArrayList<Integer>();
		all.add(20);
		all.add(30);
		all.add(40);
		all.add(15);
		
		for(int i)

		Comparator<Interger> c = (i, j) -> {
			if (i.a > j.b) {
				return 1;
			} else if (i.a < j.b) {
				return -1;
			} else {
				return 0;
			}
		};

		log.info(" " + c);
	}

}
