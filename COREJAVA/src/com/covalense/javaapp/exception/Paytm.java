package com.covalense.javaapp.exception;

import java.io.File;
import java.io.IOException;

public class Paytm extends Irctc {
	void getTicket() throws IOException {
		System.out.println("getting ticket");
		File f=new File("swati.txt");
		/*
		 * f.createNewFile();
		 */
		try {
			f.createNewFile();
			}
		catch(IOException i) {
			System.out.println("exception got in getTicket() of paytm");
			throw i;
		}
		System.out.println("got ticket");
	}

}
