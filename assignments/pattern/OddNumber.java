package com.covalense.javaapp.pattern;

public class OddNumber {
	public static void main(String args[]) {
		System.out.println("Divided by 7: ");
		for (int i = 1; i < 100; i++) {
			if (i % 7 == 0 && i % 2 == 1)
				System.out.print(i + ", ");
		}
	}
}
