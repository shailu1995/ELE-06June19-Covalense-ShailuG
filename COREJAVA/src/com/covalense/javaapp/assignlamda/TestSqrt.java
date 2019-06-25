package com.covalense.javapp.assignlamda;

import java.util.logging.Logger;

/*
*
* WAP to calculate sqrt of given number 
*/
public class TestSqrt {
	private static final Logger log = Logger.getLogger("shailu");

	public static void main(String[] args) {
		Sqrt s=(num)->{
			return num * num;
		};
		int res = s.sqrtnum(5);
		log.info("" + res);

	}

}
