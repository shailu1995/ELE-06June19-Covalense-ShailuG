package com.covalense.javapp.thread;

import lombok.extern.java.Log;

@Log
public class Mouse implements Runnable {

	String name;

	public Mouse(String name) {
		this.name = name;

	}

	public void run() {

		for (int i = 1; i <= 5; i++) {
			log.info("output " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}
