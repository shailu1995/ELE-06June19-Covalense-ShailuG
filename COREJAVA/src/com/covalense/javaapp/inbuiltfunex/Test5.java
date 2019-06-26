package com.covalense.javapp.inbuiltfunex;

public class Test5 {

	public static void main(String[] args) {
		MyStudent my = new MyStudent();
		Average a = my::calAvg;
		a.avg(20, 36, 54);

	}

}
