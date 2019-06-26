package com.covalense.javapp.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import lombok.extern.java.Log;

@Log
public class TestPencil {

	public static void main(String[] args) {
		Pencil p1 = new Pencil();

		FutureTask<Integer> ft = new FutureTask<Integer>(p1);

		Thread t1 = new Thread(ft);
		t1.start();

		try {
			int i = ft.get();
			log.info("value is" + i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
