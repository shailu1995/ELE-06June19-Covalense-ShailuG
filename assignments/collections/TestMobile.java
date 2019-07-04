package com.covalense.javaapp.collections;


	import java.util.TreeSet;
	import java.util.logging.Logger;

	/*
	 * WAP to sort the mobile object based on the price
	 */
	public class TestMobile {

	private static final Logger log=Logger.getLogger("shailu");

		public static void main(String[] args) {
			TreeSet<Mobile> t = new TreeSet<Mobile>();
			Mobile m1 = new Mobile();
			m1.set("MI", 20000, "MI");
			Mobile m2 = new Mobile();
			m2.set("IPhone", 100000, "apple");
			Mobile m3 = new Mobile();
			m3.set("note 2 MI ", 10000, "MI");
			Mobile m4 = new Mobile();
			m4.set("galaxy 2", 15000, "sam");
			Mobile m5 = new Mobile();
			m5.set("note 5", 20000, "sam");
			t.add(m1);
			t.add(m2);
			t.add(m3);
			t.add(m4);
			t.add(m5);

			for (Mobile p : t) {
				log.info("name=" + p.name + " cost= " + p.cost + " brand=" + p.brand);
			}
		}

	

}
