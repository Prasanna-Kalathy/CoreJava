package com.pk.core.oops.inheritance;

public class SingleInheritance {

	void m1() {
		System.out.println("Inside M1");
	}
	
	public static void main(String[] args) {
		SingleInheritance s1 = new SingleInheritance();
		s1.m1();		//methods from this class
		s1.getClass();	//methods inherited from object class
		s1.notify();
	}
}
