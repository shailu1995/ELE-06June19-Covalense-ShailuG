package com.covalense.javaapp.implamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.extern.java.Log;

@Log
public class TestF {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(6);
		al.add(4);
		al.add(3);
		al.add(2);

		List<Integer> t = al.stream().sorted().collect(Collectors.toList());
		log.info("" + t);
	}

}
