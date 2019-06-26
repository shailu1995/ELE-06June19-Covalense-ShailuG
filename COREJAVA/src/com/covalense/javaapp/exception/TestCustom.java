package com.covalense.javaapp.exception;

public class TestCustom {

	public static void main(String[] args) {
		System.out.println("main started");
		String s="shai";
		Validate v=new Validate();

		v.validator(s);

		System.out.println("main ended");
	}

}
