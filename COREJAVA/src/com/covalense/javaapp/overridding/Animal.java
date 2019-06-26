package com.covalense.javaapp.overridding;

 class Test
{
void eat()
{
	System.out.println("animal eats");
	}
}
class Cow extends Test
{
	void eat()
	{
		System.out.println("eats grass");
	}
	}
class Lion extends Test
{
	void eat()
	{
		System.out.println("eats meat");
	}
	}


