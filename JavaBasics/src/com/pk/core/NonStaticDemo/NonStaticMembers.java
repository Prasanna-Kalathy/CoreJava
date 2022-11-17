package com.pk.core.NonStaticDemo;

public class NonStaticMembers {
	int a;

	public NonStaticMembers() {
		System.out.println("Inside Constructor");
	}

	{
		System.out.println("Inside Non Static Block");
	}

	public static void main(String[] args) {
		System.out.println("Inside Main Method");
		new NonStaticMembers();
		new NonStaticMembers();
		new NonStaticMembers(); 
	}
	
	static {
		System.out.println("Inside Static Block");
	}
}
