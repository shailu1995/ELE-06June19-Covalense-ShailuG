package com.covalense.javaapp.abstraction;

public class Machine {
	void slot(ATMcard a)
	{
		a.validate();
		a.getinfo();
	}

}
