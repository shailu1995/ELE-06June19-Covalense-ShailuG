package com.covalense.jdbcapp.commons;

import lombok.extern.java.Log;

@Log
public class ClassB implements Connection {

	@Override
	public void printMessage() {
		log.info("BBB");
	}

}
