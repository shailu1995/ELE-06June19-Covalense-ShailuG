package com.covalense.javaapp.stream;

import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.stream.Stream;

import lombok.extern.java.Log;

@Log
public class TestA {
	static Logger log = Logger.getLogger("shailu");

	public static void main(String[] args) {
		Integer[] a = { 5, 2, 4, 7, 8 };

		Stream<Integer> s = Stream.of(a);
		s.forEach(i -> log.info("  " + i));
	}

}
