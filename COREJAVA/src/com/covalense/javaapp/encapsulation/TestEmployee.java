package com.covalense.javaapp.encapsulation;

public class TestEmployee {
	public static void main(String[] args) {


		Employee e=new Employee();
		e.setCompany("ibm");
		e.setId(3);
		Girl g=new Girl();
		g.show(e);
		Boy b=new Boy();
		b.show(e);
	}
}
