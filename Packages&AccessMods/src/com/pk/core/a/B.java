package com.pk.core.a;

public class B {

	public static void main(String[] args) {
		//Create A obj fro getting the variables from A class
		A a = new A();
//		System.out.println(a.a);	//not visible since it is in private
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
	}

}
