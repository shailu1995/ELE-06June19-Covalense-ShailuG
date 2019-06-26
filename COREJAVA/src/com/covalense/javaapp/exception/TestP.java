package com.covalense.javaapp.exception;

import java.io.IOException;

public class TestP {

	public static void main(String[] args) {

		Paytm p = new Paytm();
		System.out.println("main started");

		p.book();
		try {
			p.getTicket();
		} catch (IOException e) {

			System.out.println("Exception caught in main() method");
		}

		System.out.println("main ended");
	}

}
