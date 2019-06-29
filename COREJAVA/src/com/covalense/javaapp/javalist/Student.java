package com.covalense.collection.javalist;

public class Student implements Comparable<Student> {
	String name;
	int id;
	double percentage;

	public int compareTo(Student o) {

		int k = this.name.compareTo(o.name);
		return k;
	}

}

/* logic to sort student w.r.to id */
/*
 * public int compareTo(Student s) { if(this.id< s.id) { return -1; } else
 * if(this.id> s.id) { return 1; } else{ return 0; }
 * 
 * return 0; }
 */

/* logic to sort student w.r.to percentage */
/*
 * public int compareTo(Student s) { if(this.percentage< s.percentage) { return
 * -1; } else if(this.percentage> s.percentage) { return 1; } else{ return 0; }
 * 
 */
