package com.pk.core.oops.polymorphism.runtimepoly;

public class MacBookPro extends Macbook {
	@Override
	public void start() {
		System.out.println("Inside MacbookPro start method");
	}

	@Override
	public void shutdown() {
		System.out.println("Inside MacbookPro ShutDown method");
	}
	
	public void Prosmethod() {
		System.out.println("Inside MacbookPro Prosmethod method");
	}
	
}
