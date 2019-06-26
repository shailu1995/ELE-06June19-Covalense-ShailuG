package com.covalense.javaapp.implamda;

import lombok.extern.java.Log;

@Log
public class TestA {
	public static void main(String[] args) {

		String s = "Apple";

		switch (s) {
		case "Apple":
			log.info("its Apple");

			break;
		case "Mango":
			log.info("its Mango");

			break;
		default:
			log.info("its OTHER");

			break;

		}
	}
}
