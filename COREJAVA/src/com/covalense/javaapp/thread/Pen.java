package com.covalense.javapp.thread;

import lombok.extern.java.Log;

@Log
public class Pen extends Thread {
	public void run() {

		for (int i = 1; i <= 5; i++) {
			try {
				sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			log.info("output :" + i);
		}
	}
}
