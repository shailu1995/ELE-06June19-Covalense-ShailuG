package com.covalense.javaapp.overridding;

public class TestCar {

	public static void main(String[] args) {
		LevelOne a = new LevelOne();
		LevelTwo b = new LevelTwo();
		LevelThree c = new LevelThree();

		b.run();
		a.run();
		c.run();
	}

}
