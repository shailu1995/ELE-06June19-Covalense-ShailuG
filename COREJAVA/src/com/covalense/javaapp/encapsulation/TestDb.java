package com.covalense.javaapp.encapsulation;

public class TestDb {

	public static void main(String[] args) {
		Person p=new Person();
		p.setName("sneha");
		p.setAge(23);
		DB1 d=new DB1();
		d.recv(p);
		DB2 c=new DB2();
		c.recv(p);
		
	}

}
