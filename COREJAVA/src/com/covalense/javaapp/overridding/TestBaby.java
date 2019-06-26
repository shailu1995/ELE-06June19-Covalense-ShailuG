package com.covalense.javaapp.overridding;

public class TestBaby {

	public static void main(String[] args) {
		Baby b=new Baby();
		Lays l=new Lays();
		Kurkure k=new Kurkure();
		b.accept(l);
		b.accept(k);


	}

}
