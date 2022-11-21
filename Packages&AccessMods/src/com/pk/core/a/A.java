package com.pk.core.a;

public class A {
	private int a = 5;
	int b;
	protected int c = 8;
	public int d = 9;

	public static void main(String[] args) {
		//Since they are non static members we need to craete object to access them
		A C1 = new A();
		System.out.println(C1.a);
		System.out.println(C1.b);
		System.out.println(C1.c);
		System.out.println(C1.d);
	}
}
