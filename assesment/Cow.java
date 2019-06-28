package com.covalense.corejava.assessment;

import lombok.extern.java.Log;

@Log
public class Cow extends Animal {

	@Override
	void sound() {
		log.info("amba amba......!!!");

	}

}
