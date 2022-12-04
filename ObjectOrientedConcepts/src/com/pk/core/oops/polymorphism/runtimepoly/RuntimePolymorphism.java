package com.pk.core.oops.polymorphism.runtimepoly;

public class RuntimePolymorphism {
	public static void main(String[] args) {
		Macbook mbp1 = new MacBookPro();
		mbp1.shutdown();
		mbp1.start();
		Macbook mbp2 = new MacBookAir();
		mbp2.shutdown();
		mbp2.start();
	}
}
