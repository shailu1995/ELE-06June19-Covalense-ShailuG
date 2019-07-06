package com.covalense.javaapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathOppTest {

	MathOpp m = new MathOpp();

	@Test
	public void test() {
		assertEquals(40, m.add(10, 30));

	}

	@Test
	public void testDiv() {
		assertEquals(1, m.div(30, 30));

	}

	@Test(expected = ArithmeticException.class)
	public void testDivForException() {
		m.div(10, 0);
	}

}
