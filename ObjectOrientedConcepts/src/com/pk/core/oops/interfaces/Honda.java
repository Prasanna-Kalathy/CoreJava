package com.pk.core.oops.interfaces;

public class Honda implements Car {

	@Override
	public void go() {
		System.out.println("Inside Honda's Go");

	}

	@Override
	public void stop() {
		System.out.println("Inside Honda's Stop");
	}

}
