package com.covalense.jdbcapp.commons;

import java.sql.Connection;

import lombok.extern.java.Log;

@Log
public class ClassA implements Connection {
    public void printMessage() {
		log.info("AAAA");
		
	}

	
	

}
