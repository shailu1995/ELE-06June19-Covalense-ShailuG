package com.covalense.javaapp.stream;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import lombok.extern.java.Log;

@Log
public class TestB {

	public static void main(String[] args) {

		ZoneId z = ZoneId.systemDefault();
		log.info("" + z);
		ZoneId a = ZoneId.systemDefault();
		ZonedDateTime ze = ZonedDateTime.now(a);
		log.info("" + ze.toLocalDate());
		log.info("" + ze.toLocalDate());
	}

}
