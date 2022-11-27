package com.pk.core.oops.abstraction;

public abstract class BMW {

	void commonFunc() {
		System.out.println("Inside commonFunc method");
	}

	abstract void accelerate();

	public static void main(String[] args) {
		System.out.println("Inside the main method");
	}

}
