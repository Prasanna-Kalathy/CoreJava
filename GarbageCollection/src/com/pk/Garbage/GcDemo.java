package com.pk.Garbage;

public class GcDemo {
	
	public GcDemo() {
		System.out.println(this+" Created");
	}
	public static void main(String[] args) {
		new GcDemo();
		new GcDemo();
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(this+" Destroyed");
	}
}
