package com.covalense.corejava.assessment;

import lombok.extern.java.Log;

@Log
public class TestAnimal {

	public static void main(String[] args) {
		Animal a = new Animal();

		Cow c = new Cow();
		Lion l = new Lion();
		a.sound();
		c.sound();
		l.sound();
	}

}
