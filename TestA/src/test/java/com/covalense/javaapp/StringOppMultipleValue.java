package com.covalense.javaapp;

import static org.junit.Assert.*;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringOppMultipleValue {

	private StringOpp str = new StringOpp();

	private String name;
	private int value;

	public StringOppMultipleValue(String name, int value) {

		this.name = name;
		this.value = value;
	}

	@Parameters
	public static Collection<Object[]> getPairs() {

		Object[][] obj = {
				{ "shailu", 6 },
				{ "1557   ", 7 },
				{ "song sony", 9 } 
				};
		return Arrays.asList(obj);

	}

	@Test
	public void test() {
		int res = str.count(name);
		assertEquals(value, res);

	}

}
