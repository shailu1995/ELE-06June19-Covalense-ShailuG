package com.covalense.javaapp.exception;

public class Validate extends RuntimeException{
	void validator(String s) {
		if(s.length()>=5)
		{
			System.out.println("perfect");
			}
		else {
			throw new ArrayIndexOutOfBoundsException("********");
		}
	}
	

}
