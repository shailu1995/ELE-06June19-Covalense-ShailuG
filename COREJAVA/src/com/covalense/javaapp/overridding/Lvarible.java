package com.covalense.javaapp.overridding;

 class a {
	int i=90;
}
class b extends a{
	int i=60;
	void n() {
		int i=30;
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);


	}

}
public class Lvarible{
	public static void main(String[] args) {
		b k=new b();
		k.n();
		
	}
}
//test  for variables