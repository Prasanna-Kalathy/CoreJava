package com.pk.core.Premitives;

public class ObjStr {

	public static void main(String[] args) {
		double u = 1351650.35131;
		System.out.println(u);				//Double (Primitive)
		
		Double p = Double.valueOf(u);
		System.out.println(p);				//Object
		
		String s = p.toString();			//String
		System.out.println(s);
		
		float l = p.floatValue();			//Float (Primitive)
		System.out.println(l);

	}

}
