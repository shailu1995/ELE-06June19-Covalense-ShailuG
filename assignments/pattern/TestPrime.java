package com.covalense.javaapp.pattern;

public class TestPrime {

	public static void main(String[] args) {

		int low = 1, high = 100;

		while (low < high) {
			boolean flag = false;

			for(int i = 2; i <= low/2; ++i) {

				if(low % i == 0) {
					flag = true;
					break;
					}
				}
			if (!flag)
				System.out.print(low + " ");
			++low;
		}
	}
}