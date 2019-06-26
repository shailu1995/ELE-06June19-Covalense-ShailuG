package com.covalense.javaapp.casting;

public class TestChips {

	public static void main(String[] args) {
		Chips c = new Lays();
		Lays l = (Lays) c;
		l.eat();

		Chips r = new Bingo();
		Bingo b = (Bingo) r;
		b.byteBingo();

	}

}
