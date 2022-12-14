package com.pk.core.Multithreading.yield;

public class InterruptDemo {
	public static void main(String[] args) {
		Interrupt intr = new Interrupt();
		intr.start();
		intr.interrupt();
		System.out.println("End of main method of demo");
	}
}
