package com.covalense.javaapp.lamdaex;

interface Fact{
	int fact(int a);
}
public class Test2 {
	public static void main(String[] args) {
		 Fact f=(a)->{
	     int fnum=1;
		 for(int i=1;i<=a;i++) {
			 fnum=fnum*i;
		 }
		 return fnum;
		 };
		 int num = f.fact(5);
		 System.out.println(num);
	}
}
