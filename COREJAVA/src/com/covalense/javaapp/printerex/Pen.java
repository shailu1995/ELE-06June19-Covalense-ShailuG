package com.covalense.javaapp.printerex;

public abstract class Pen extends Pencil {
	void write() {
		System.out.println("writting");
	}

	abstract void colour();

}
