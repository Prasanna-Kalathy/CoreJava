package com.pk.core.oops.inheritance.conschaining;

public class SuperClass {
	int x;

	public SuperClass() {
		
		System.out.println("No Arg Parent Constructor");
	}

	public SuperClass(int x) {
		this();
		System.out.println("One Arg Parent Constructor");
	}
}
