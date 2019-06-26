package com.covalense.javaapp.parsing;

public class Parsing {
	public static void main(String[] args) {
		String a = "3";
		String b = "4";
		String c = "2.45";
		String d = "true";
		System.out.println(a + b);
		int i = Integer.parseInt(a);
		int j = Integer.parseInt(b);
		System.out.println(i + j);
		double k = Double.parseDouble(c);
		System.out.println(k);
		boolean l = Boolean.parseBoolean(d);
		System.out.println(l);
	}

}
