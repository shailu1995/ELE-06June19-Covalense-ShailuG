package com.covalense.javapp.inbuiltfunex;

import java.util.function.Supplier;

public class Test2 {

	public static void main(String[] args) {
		Supplier<Car> s = () -> new Car(105.5);
		Car c = s.get();
		System.out.println(c.fuel);
	}

}
