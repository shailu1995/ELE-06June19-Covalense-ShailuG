package com.covalense.javaapp.abstraction;

public class TestAtm {
	public static void main(String[] args) {
		Machine m=new Machine();
		Icici i=new Icici();
		Hdfc h=new Hdfc();
		Sbi s=new Sbi();
		m.slot(s);
	}

}
