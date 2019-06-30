package com.covalense.javaapp.collections;

import java.util.logging.Logger;

public class TestUncheckedException {

	private static final Logger log = Logger.getLogger("shailu");

	public static void main(String[] args) {
		ValidAge v = new ValidAge();
		try {
			v.valid(18);
		} catch (NotValidAge e) {

			log.info(" " + e);
		}
	}
}
