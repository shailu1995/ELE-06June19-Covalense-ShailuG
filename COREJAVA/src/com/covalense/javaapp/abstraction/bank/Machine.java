package com.covalense.javaapp.abstraction.bank;

public class Machine {
	void slot(ATMcard a)
	{
		a.validate();
		a.getinfo();
	}

}
