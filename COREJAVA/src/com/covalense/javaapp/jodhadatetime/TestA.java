package com.covalense.javaapp.jodhadatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Year;

import lombok.extern.java.Log;

@Log
public class TestA {

	public static void main(String[] args) {

		LocalDate a = LocalDate.now();
		log.info("" + a.getDayOfMonth());
		log.info("" + a.getMonthValue());
		log.info("" + a.getDayOfWeek());
		log.info("i born on" + a.getYear());
		LocalDate b = LocalDate.of(1995, 10, 23);
		Period p = Period.between(b, a);

		log.info("" + b.getYear());
	}

}
