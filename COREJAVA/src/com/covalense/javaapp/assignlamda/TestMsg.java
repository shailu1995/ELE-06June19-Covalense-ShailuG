package com.covalense.javapp.assignlamda;

import java.util.logging.Logger;

/*
 * WAP to print msg using lambda exp
 */
public class TestMsg {

	private static final Logger log = Logger.getLogger("shailu");

	public static void main(String[] args) {
		Msg m =()-> {
			log.info("hi this is lambda");
		};
		m.message();
	}

}
