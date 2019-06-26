package com.covalense.javapp.thread;

public class Browser extends Thread {
	PVR ref;

	public Browser(PVR p) {
		this.ref = p;

	}

	@Override
	public void run() {
		ref.book();
	}

}
