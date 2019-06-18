package com.covalense.javaapp.penex;


public abstract class Pen extends Pencil{
	void write() {
		System.out.println("writting");
	}
	abstract void colour();

}
