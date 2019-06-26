package com.covalense.javapp.thread;

import lombok.extern.java.Log;

@Log
public class Marker implements Runnable {
	@Override
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
