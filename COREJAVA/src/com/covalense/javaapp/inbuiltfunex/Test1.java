package com.covalense.javapp.inbuiltfunex;

import java.util.function.Supplier;

import lombok.extern.java.Log;

@Log
public class Test1 {

	public static void main(String[] args) {
		Supplier<Gun> s = () -> new Gun(100);
		Gun g = s.get();
		System.out.println(g.bullets);
	}
}
