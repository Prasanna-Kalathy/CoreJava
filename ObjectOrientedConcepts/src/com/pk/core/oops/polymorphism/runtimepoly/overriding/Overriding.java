package com.pk.core.oops.polymorphism.runtimepoly.overriding;

public class Overriding {
	public static void main(String[] args) {

		Parent p = new Parent();
		p.Display();
		System.out.println(p.s);
	
		Child c = new Child();
		c.Display();
		System.out.println(c.s);
		
		
		Parent c1 = new Child();
		c1.Display();				//non Static Method depends on the Object type
		System.out.println(c1.s);	//Variables depends on the Constructor used
	}
}
