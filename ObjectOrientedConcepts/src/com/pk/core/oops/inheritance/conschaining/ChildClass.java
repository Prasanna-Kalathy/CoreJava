package com.pk.core.oops.inheritance.conschaining;

public class ChildClass {
	int x;

	public ChildClass() {
		System.out.println("No Arg Child Constructor");
	}

	public ChildClass(int x) {
		System.out.println("One Arg Child Constructor");
	}
	
	public static void main(String[] args) {
		ChildClass c = new ChildClass();
	}
}
