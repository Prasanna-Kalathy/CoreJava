package com.pk.core.b;

public class D{

	public static void main(String[] args) {
		C c = new C();

//		System.out.println(a.a);	//not visible since it is in private
//		System.out.println(a.b);	//not visible since it is in Package
//		System.out.println(c.c);	//not visible since it is not inherited
		System.out.println(c.d);	//public can be accessed just by inheritance
	}

}
