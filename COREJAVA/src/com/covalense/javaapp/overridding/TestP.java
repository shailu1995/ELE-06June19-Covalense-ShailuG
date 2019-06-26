package com.covalense.javaapp.overridding;

public class TestP {

	public static void main(String[] args)
	{
		Girl g=new Girl();
		Phone p=new MiPhone();
		g.recve(p);
	}

}
