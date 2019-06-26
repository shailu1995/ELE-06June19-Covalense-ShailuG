package com.covalense.javaapp.foreach;

import java.io.ObjectInputStream.GetField;

public class TestEmployee {
	public static void main(String[] args) {

		Employee[] e=new Employee[4];

		Employee a=new Employee();
		a.setName("SWATI");
		a.setId(23);
		a.setSalary(20000);

		Employee b=new Employee();
		b.setName("SNEHA");
		b.setId(23);
		b.setSalary(20000);

		Employee c=new Employee();
		c.setName("SANJU");
		c.setId(23);
		c.setSalary(20000);

		Employee d=new Employee();
		d.setName("GANDHI");
		d.setId(23);
		d.setSalary(20000);

		e[0]=a;
		e[1]=b;
		e[2]=c;
		e[3]=d;
		
	

		for(Employee emp:e) {
			System.out.println("name is " + emp.getName());
			System.out.println("id is "+ emp.getId());
			System.out.println("salary is"+ emp.getSalary());
		}

	}

}
