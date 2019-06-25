package com.covalense.javapp.assignlamda;

import java.util.logging.Logger;

/*
	 * WAP to cal factorial using lambda exp
	 */
	public class TestFact {
		private static final Logger log = Logger.getLogger("shailu");

		public static void main(String[] args) {
			Fact f = (num) -> {
				int fa = 1;
				for (int i = 1; i <= num; i++)
					fa = fa *i ;
				return fa;
			};
			int fa = f.fact(5);
			log.info("" + fa);

		}

	}


