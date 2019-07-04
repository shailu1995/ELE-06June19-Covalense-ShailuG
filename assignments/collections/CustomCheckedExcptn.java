package com.covalense.javaapp.collections;

import java.util.logging.Logger;

public class CustomCheckedExcptn {

	private static final Logger log = Logger.getLogger("shailu");

	public static void main(String[] args) {
		ValidNum v = new ValidNum();
		try {
			v.valid(0);
		} catch (NotValidNum e) {

			log.info(" " + e);
		}
	}

}
