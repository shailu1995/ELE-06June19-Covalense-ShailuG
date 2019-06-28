package com.covalense.corejava.assessment;

import lombok.extern.java.Log;

@Log
public class TestSimple {

	public static void main(String[] args) {

//lamda function to calculate factorial

		Simple s = (p, t, r) -> (p * t * r) / 100;
		int a = s.sim(100, 12, 6);
		log.info("simple intrest is" + a);

	}

}// end of main
