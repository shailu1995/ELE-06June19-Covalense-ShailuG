package com.covalense.javapp.thread;

import lombok.extern.java.Log;

@Log
public class TestPVR {

	public static void main(String[] args) {
		PVR p = new PVR();

		Browser t1 = new Browser(p);
		t1.start();

	}

}
