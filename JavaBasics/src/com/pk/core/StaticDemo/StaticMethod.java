package com.pk.core.StaticDemo;

public class StaticMethod {
	public static void main(String[] args) {
		System.out.println("Inside Main");
		StaticMethod.method2();
		StaticMethod.method1();
	}

	static void method1() {
		System.out.println("Inside Method 1");
	}

	static void method2() {
		System.out.println("Inside Method 2");
	}

	static {
		StaticMethod.method2();
		StaticMethod.method1();

	}
}
