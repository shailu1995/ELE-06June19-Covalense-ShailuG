package com.covalense.javaapp.stream;

import java.util.stream.Stream;

public class Mref {

	public static void main(String[] args) {

		Stream<Integer> s = Stream.of(2, 3, 4, 5);
		s.forEach(System.out::println);

	}

}
