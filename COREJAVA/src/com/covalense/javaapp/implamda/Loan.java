package com.covalense.javaapp.implamda;

public enum Loan {
	HOME(240), PERSON(241), CAR(242);

	private int value;

	private Loan(int value) {
		this.value = value;

	}

	public int getValue() {
		return value;
	}

}
