package com.covalense.javapp.exp1;

import java.util.logging.Logger;


public class TestMyArrayClass {
	public static final Logger log=Logger.getLogger("MyArrayClass");

	public static void main(String[] args) {
		long startTime =System.currentTimeMillis();
	
		MyArrayClass mac=new MyArrayClass();
		int size=20;
		//adding the values
		for(int i=0;i<size;i++) {
			mac.add("value "+i);
		}
		
		log.info("removing  index");
		mac.remove(2);

		//getting values
		for(int i=0;i<size;i++) {
			log.info("output =" +mac.get(i));
		}
		
		
		
		long endTime =System.currentTimeMillis();
		log.info("Total excution time is "+(endTime-startTime)+ "ms");
	}

}
