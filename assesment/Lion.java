package com.covalense.corejava.assessment;

import lombok.extern.java.Log;

@Log
public class Lion extends Animal {

	@Override
	void sound() {
		log.info("rowring rowring------!!");

	}

}
