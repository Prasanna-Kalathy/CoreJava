package com.pk.core.oops.inheritance.conschaining;

public class ChildClass extends SuperClass{

	public ChildClass() {
		this(10);
		System.out.println("No Arg Child Constructor");
	}

	public ChildClass(int x) {
		super(x);
		System.out.println("One Arg Child Constructor");
	}
	
	public static void main(String[] args) {
		ChildClass c = new ChildClass();
	}
}
