package com.covalense.javaapp.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestStudenByForEachLoop {

	public static void main(String[] args) {
		ArrayList<StudentByForEachLoop> a = new ArrayList<StudentByForEachLoop>();
		StudentByForEachLoop e1 = new StudentByForEachLoop();
		e1.set("shailu", 20, 60);
		StudentByForEachLoop e2 = new StudentByForEachLoop();
		e2.set("anjali", 10, 90);
		a.add(e1);
		a.add(e2);
		HashMap<String, ArrayList<StudentByForEachLoop>> m = new HashMap<String, ArrayList<StudentByForEachLoop>>();
		m.put("first", a);
		for (Map.Entry<String, ArrayList<StudentByForEachLoop>> e : m.entrySet()) {
			String key = e.getKey();
			System.out.println(key);
			ArrayList<StudentByForEachLoop> ar = e.getValue();
			for (StudentByForEachLoop el : ar) {
				el.get();
			}

		}
	}
}
