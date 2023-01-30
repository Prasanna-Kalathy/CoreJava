package com.pk.Collections.Misc;

import java.util.Random;

public class RandomGen {
	public static void main(String[] args) {
		Random rnd = new Random(1100);
		Random rnd2 = new Random(1100);

		int i = rnd.nextInt(100);
		System.out.println(i);
		int k = rnd.nextInt(10);
		System.out.println(k);
		int r = rnd2.nextInt(100);
		System.out.println(r);

	}
}
