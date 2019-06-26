package com.covalense.javaapp.implamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class TestE {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(6);
		al.add(4);
		al.add(3);
		al.add(2);

		long t = al.stream().filter(i -> i % 2 != 0).count();
		log.info(" Number of objects are " + t);
	}

}
