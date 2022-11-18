package com.pk.core.WrapperType;

public class WTConstructors {
	public static void main(String[] args) {
		short a=015;
		System.out.println(a);

		Short b = new Short(a);  //takes primitive
		System.out.println(b);

		String s ="015";
		System.out.println(s);

		Short f = new Short(s);		//takes String
		System.out.println(f);
		 
	}
}
