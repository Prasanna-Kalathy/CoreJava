package com.pk.core.Premitives;

public class PremiObjects {
	public static void main(String[] args) {
		int x= 100;
		Integer a = Integer.valueOf(x);  //converted primitive to a Object
		a.intValue();					//converted object to a primitive
	
		System.out.println(a.getClass().getName());
		System.out.println(x);
		System.out.println(a);
	}

}
