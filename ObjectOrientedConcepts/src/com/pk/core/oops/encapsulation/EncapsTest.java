package com.pk.core.oops.encapsulation;

public class EncapsTest {
	public static void main(String[] args) {
		Customer c = new Customer();
		
		System.out.println(c.getFirstname());
		System.out.println(c.getLastname());
		System.out.println(c.getCC());
		
		c.setFirstname("Naruto");
		c.setLastname("Uzumaki");
		c.setCC("654351684");
		
		System.out.println();
		
		System.out.println(c.getFirstname());
		System.out.println(c.getLastname());
		System.out.println(c.getCC());
	}
}
