package com.covalense.javaapp.collections;

import java.util.logging.Logger;

import lombok.extern.java.Log;

@Log
public class Count {
	private static final Logger log = Logger.getLogger("shailu");

	static int count;

	public Count() {
		count++;

	}

	static void getCount() {
		log.info("number of object created= " + count);
	}

}
