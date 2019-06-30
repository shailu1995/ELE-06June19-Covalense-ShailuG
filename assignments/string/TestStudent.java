package com.covalense.javaapp.string;

public class TestStudent {


	public static void main(String[] args) {

		Student[] s=new Student[4];
		Student a=new Student();
		Student b=new Student();
		Student c=new Student();
		Student d=new Student();

		a.setName("shailu");
		a.setMarks(35);
		b.setName("swati");
		b.setMarks(65);
		c.setName("sneha");
		c.setMarks(55);
		d.setName("sanju");
		d.setMarks(45);
		
		s[0]=a;
		s[1]=b;
		s[2]=c;
		s[3]=d;
		
		for(int i=0;i<4;i++){
			System.out.println("name of student "+s[i].getName()+" obtained  "+s[i].getMarks());
		}
	}
}
