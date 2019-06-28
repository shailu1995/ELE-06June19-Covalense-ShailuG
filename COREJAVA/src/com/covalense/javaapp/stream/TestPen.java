package com.covalense.javaapp.stream;

import lombok.extern.java.Log;

@Log
public class TestPen {

	public static void main(String[] args) {

		// method referencing
		Demo d = (x) -> log.info("" + x);
		d.Print(4);

		//
		Pen p = new Pen();
		Demo c = p::write;
		c.Print(10);
	}

}
