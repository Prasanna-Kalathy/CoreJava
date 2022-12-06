package com.pk.core.oops.polymorphism.runtimepoly;

public class MacBookAir extends Macbook {
	@Override
	public
	void start() {
		System.out.println("Inside MacbookAir start method");
	}

	@Override
	public
	void shutdown() {
		System.out.println("Inside MacbookAir ShutDown method");
	}
}
