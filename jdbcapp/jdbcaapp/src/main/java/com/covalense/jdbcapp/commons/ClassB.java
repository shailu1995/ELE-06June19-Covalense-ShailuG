package com.covalense.jdbcapp.commons;

import java.sql.Connection;

import lombok.extern.java.Log;

@Log
public class ClassB implements Connection {
	public void printMessage() {
		log.info("bbbb");
		
	}


	

}
