package com.covalense.javaapp.example;

public class Exp {
	public static void main(String[] args) {

		int[] a = { 6, 2, 3, 5, 6 };
		int b[] = { 40, 50, 60, 20, 30 };
		int c = 0;
		for (int i = 2; i < a.length; i++) {
			b[i] = a[c++];
		}

		for (int j = 0; j < b.length; j++) {
			System.out.println(b[j]);
		}
	}

}
