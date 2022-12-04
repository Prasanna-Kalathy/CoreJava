package com.pk.core.oops.polymorphism.runtimepoly;

public class MacBookAir extends Macbook {
	@Override
	void start() {
		System.out.println("Inside MacbookAir start method");
	}

	@Override
	void shutdown() {
		System.out.println("Inside MacbookAir ShutDown method");
	}
}
