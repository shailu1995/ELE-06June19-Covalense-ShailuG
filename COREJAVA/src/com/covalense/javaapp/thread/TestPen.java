package com.covalense.javapp.thread;

import lombok.extern.java.Log;

@Log
public class TestPen {

	public static void main(String[] args) {
		log.info("Main started ");
		Pen t1 = new Pen();
		t1.run();
		Pen t2 = new Pen();
		t2.run();
		Pen t3 = new Pen();
		t3.start();
		log.info("Main ended ");
	}

}
