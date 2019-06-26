package com.covalense.javaapp.example;

public class Car 
{
public static void main(String[] args)
{
	long CarPrice=570000;
	double rtoCharge=(CarPrice * 14.26)/100;
	double insurence=(CarPrice * 9.76)/100;
	double total=rtoCharge +insurence;
	System.out.println("show room price"+ total);
	System.out.println( "RTO"+ rtoCharge);
	System.out.println("insurence" + insurence);
}
}
