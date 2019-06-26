package com.covalense.javaapp.encapsulation;

public class TestDb {

	public static void main(String[] args) {
		Person p=new Person();
		p.setName("sneha");
		p.setAge(23);
		DBA d=new DBA();
		d.recv(p);
		DBB c=new DBB();
		c.recv(p);
		
	}

}
