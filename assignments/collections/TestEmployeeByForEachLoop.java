package com.covalense.javaapp.collections;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.parser.Entity;

/*
 * WAP to store EmployeeByForEachLoop WRT role (using Map<string,arraylist<EmployeeByForEachLoop>>)
 */
public class TestEmployeeByForEachLoop {

	public static void main(String[] args) {
		ArrayList<EmployeeByForEachLoop> a = new ArrayList<EmployeeByForEachLoop>();
		EmployeeByForEachLoop e1 = new EmployeeByForEachLoop();
		e1.set("shailu", 20, "IT", 20000);
		EmployeeByForEachLoop e2 = new EmployeeByForEachLoop();
		e2.set("sapna", 20, "IT", 20000);
		a.add(e1);
		a.add(e2);
		HashMap<String, ArrayList<EmployeeByForEachLoop>> m = new HashMap<String, ArrayList<EmployeeByForEachLoop>>();
		m.put("first", a);
		for (Map.Entry<String, ArrayList<EmployeeByForEachLoop>> e : m.entrySet()) {
			String key = e.getKey();
			System.out.println(key);
			ArrayList<EmployeeByForEachLoop> ar = e.getValue();
			for (EmployeeByForEachLoop el : ar) {
				el.get();
			}

		}
	}

}
