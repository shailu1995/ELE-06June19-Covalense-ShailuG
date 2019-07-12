package com.covalense.designpatterns.test;

import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest {

	public static void main(String[] args) {
		MyImmutableClass immutableclass = null;
		immutableclass = new MyImmutableClass("SHAILU", 21, 8971048836L);
		log.info("name is" + immutableclass.getName());
		log.info("age is" + immutableclass.getAge());
		log.info("phone number" + immutableclass.getPhone());
		
		immutableclass = new MyImmutableClass("swati", 21, 7353258218L);
		log.info("name is" + immutableclass.getName());
		log.info("age is" + immutableclass.getAge());
		log.info("phone number" + immutableclass.getPhone());
	}
}
