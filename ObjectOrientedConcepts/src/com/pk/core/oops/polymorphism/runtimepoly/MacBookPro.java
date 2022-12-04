package com.pk.core.oops.polymorphism.runtimepoly;

public class MacBookPro extends Macbook {
	@Override
	void start() {
		System.out.println("Inside MacbookPro start method");
	}

	@Override
	void shutdown() {
		System.out.println("Inside MacbookPro ShutDown method");
	}
}
