package com.covalense.javaapp.implamda;

import lombok.extern.java.Log;

@Log
public class TestGender {

	public static void main(String[] args) {

		log.info(" " + Gender.FEMALE.ordinal());

		Gender t = Gender.FEMALE;

		switch (t) {
		case MALE:
			log.info("its male");

			break;
		case FEMALE:
			log.info("its female");

			break;
		case OTHER:
			log.info("its OTHER");

			break;

		}

	}

}
