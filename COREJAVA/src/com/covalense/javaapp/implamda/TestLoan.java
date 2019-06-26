package com.covalense.javaapp.implamda;

import lombok.extern.java.Log;

@Log
public class TestLoan {

	public static void main(String[] args) {
		Loan t = Loan.HOME;
		int constValue = t.getValue();
		log.info("   value of the home loan   " + constValue);
	}

}
