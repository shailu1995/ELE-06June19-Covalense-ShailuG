package com.covalense.javaapp.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class Number {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(8);
		al.add(4);
		al.add(6);
		al.add(3);
		al.add(9);

		Comparator<Integer> c = (i, j) -> i.compareTo(j);
		Integer m = al.stream().min(c).get();

		log.info("   " + m);

	}

}
