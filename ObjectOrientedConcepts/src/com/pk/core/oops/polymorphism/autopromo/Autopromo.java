package com.pk.core.oops.polymorphism.autopromo;

public class Autopromo {
	public void print(long i) {
		System.out.println("Long version " + i);
	}

	public void print(double f) {
		System.out.println("Double version " + f);
	}

//	public void print(String s) {
//		System.out.println("String version " + s);
//	}

	public void print(Object o) {
		System.out.println("Object version " + o);
	}
	
	public static void main(String[] args) {
		Autopromo ap = new Autopromo();
		ap.print("Uzumaki");
		ap.print(535.641f);
		ap.print(54);
	}
}
