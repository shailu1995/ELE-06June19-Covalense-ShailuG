package com.covalense.javapp.assignlamda;

import java.util.logging.Logger;

/*
 * WAP to print number of given range using lambda fun
 */
public class TestRange {
	private static final Logger log=Logger.getLogger("shailu");

public static void main(String[] args) {
	Range r = (num) -> {
		for (int i = 0; i <= num; i++)
			log.info(""+i);
	};
	 r.cal(10);

}
}
