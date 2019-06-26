package com.covalense.javapp.inbuiltfunex;

import java.util.logging.Logger;

public class Test8 {
	private static final Logger log = Logger.getLogger("shailu");

	public static void main(String[] args) {
		MyBoy mb = Boy::new;
		Boy s = mb.boy("sachin", 5.6, 23);
		log.info("name is " + s.name);
		log.info("height is " + s.height);
		log.info("age is " + s.age);

	}

}
