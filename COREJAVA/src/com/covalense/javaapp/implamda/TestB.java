package com.covalense.javaapp.implamda;

import lombok.extern.java.Log;

@Log
public class TestB {

	public static void main(String[] args) {
		try {
		} catch (ArithmeticException | NullPointerException e) {
			log.info("***********");
		} catch (Exception e) {
			log.info("file not found");
		}
	}

}
