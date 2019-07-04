package com.covalense.javaapp.string;

import java.util.logging.Logger;

public class CountStringA {
	private final static Logger loger = Logger.getLogger("Output");

	public static void main(String[] args) {
		String input = "Good evening";
		String newString = " ";
		int nc = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				newString = newString + nc + " ";
				nc = 0;
			} else {
				nc++;
				newString = newString + input.charAt(i);
			}
		}
		newString = newString + nc;
		loger.info(newString);
	}
}



