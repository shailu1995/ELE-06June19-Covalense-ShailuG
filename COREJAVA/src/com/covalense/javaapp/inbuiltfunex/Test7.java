package com.covalense.javapp.inbuiltfunex;

import lombok.extern.java.Log;

public class Test7 {

	public static void main(String[] args) {
		PenFactory pf = Pen::new;

		Pen r = pf.getPen(); 

		r.write();

	}
}
