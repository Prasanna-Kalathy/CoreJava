package com.pk.core.oops.polymorphism.autopromo;

public class Autopromo {
	public void print(long i) {
		System.out.println("Long version " + i);
	}

	public void print(double f) {
		System.out.println("Double version version " + f);
	}

	public static void main(String[] args) {
		Autopromo ap = new Autopromo();
		ap.print(535.641f);
		ap.print(54);
	}
}
