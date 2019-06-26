package com.covalense.javapp.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestM {

	public static void main(String[] args) {
		Mouse m1 = new Mouse("1ST");
		Mouse m2 = new Mouse("2ND");
		Mouse m3 = new Mouse("3RD");
		Mouse m4 = new Mouse("4TH");
		Mouse m5 = new Mouse("5TH");

		ExecutorService service = Executors.newFixedThreadPool(3);
		service.execute(m1);
		service.execute(m2);
		service.execute(m3);
		service.execute(m4);
		service.execute(m5);

		service.shutdown();
	}

}
