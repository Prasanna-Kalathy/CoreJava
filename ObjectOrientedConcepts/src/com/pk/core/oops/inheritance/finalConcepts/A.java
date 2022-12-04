package com.pk.core.oops.inheritance.finalConcepts;

public class A {
	final static float a=3.14f;
	
	public final void display() {
		System.out.println(A.a);
	}
	
	public static void main(String[] args) {
		A obj = new A();
		System.out.println(obj.a);
	}
}
