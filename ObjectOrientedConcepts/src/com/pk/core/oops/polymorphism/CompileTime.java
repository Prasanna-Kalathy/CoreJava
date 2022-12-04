package com.pk.core.oops.polymorphism;

public class CompileTime {

	void add(int a, int b) {
		int res = a + b;
		System.out.println("Result is: " + res);
	}

	void add(float a, float b) {
		float res = a + b;
		System.out.println("Result is: " + res);
	}

	void add(float a, float b, float c) {
		float res = a + b + c;
		System.out.println("Result is: " + res);
	}

	public static void main(String[] args) {
		CompileTime ctp = new CompileTime();
		ctp.add(4, 5);
		ctp.add(6, 8.5f);
		ctp.add(4, 5, 8);
	}
}
