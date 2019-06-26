package com.covalense.javapp.thread;

import lombok.extern.java.Log;

@Log
public class PVR {
	synchronized public void book() {
		for (int i = 1; i <= 5; i++) {
			log.info(" " + i);
			try {
				wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

	synchronized void left() {
		notifyAll();
	}
}