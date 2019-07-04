package com.covalense.javaapp.collections;


import java.util.ArrayList;
import java.util.TreeSet;
import java.util.logging.Logger;

/*
 * WAP to store the  EMP objects into Arrray list and display 
  */
public class TestEmployee{
	private static final Logger log=Logger.getLogger("shailu");

	public static void main(String[] args) {
		ArrayList<Emp> t = new ArrayList<Emp>();
		Emp e1 = new Emp();
		e1.name = "jyoti";
		e1.id = 1;
		e1.salary = 20000;

		Emp e2 = new Emp();
		e2.name = "Sapna";
		e2.id = 2;
		e2.salary = 30000;

		Emp e3 = new Emp();
		e3.name = "shailu";
		e3.id = 3;
		e3.salary = 15000;

		Emp e4 = new Emp();
		e4.name = "RekhaS";
		e4.id = 4;
		e4.salary = 50000;

		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);

		for (Emp e : t) {
			log.info("name=" + e.name + " id=" + e.id + " salary=" + e.salary);
		}

	}
}

