package com.covalense.corejava.assessment;

import lombok.extern.java.Log;

@Log
public class TestFact {

	public static void main(String[] args) {

		Factorial f = () -> {

			for (int i = 1; i < 6; i++) {
				fa = fa * i;
				int fa = f.fact(5);
				return fa;
			}

		};

		log.info("factorial of number is" + f);

	}
}