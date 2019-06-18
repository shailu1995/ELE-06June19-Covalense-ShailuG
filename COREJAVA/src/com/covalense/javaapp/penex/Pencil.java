package com.covalense.javaapp.penex;

public abstract class Pencil {
	void draw() {
		System.out.println("drawing");
	}
	abstract void write();
	abstract void colour();
}
