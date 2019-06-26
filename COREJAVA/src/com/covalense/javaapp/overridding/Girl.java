package com.covalense.javaapp.overridding;

public class Girl
{
	void recve(Phone p)
	{
		if(p instanceof MiPhone)
		{
		System.out.println("tq bro");
		}
		else if(p instanceof IPhone)
		{
			System.out.println("i love u");
			
		}
	}

}
