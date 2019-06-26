package com.covalense.javaapp.implamda;

import lombok.extern.java.Log;

@Log
public class Marker {
	public static void main(String[] args) {
		Runnable x = () -> {

			for (int i = 1; i <= 5; i++) {
				log.info("output " + i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
		};

		Thread t1 = new Thread(x);
		t1.start();

		Thread t2 = new Thread(x);
		t2.start();
	}
}
