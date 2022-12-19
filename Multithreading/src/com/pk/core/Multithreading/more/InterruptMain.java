package com.pk.core.Multithreading.more;

public class InterruptMain {
	public static void main(String[] args) {
		InterruptDemo mt = new InterruptDemo();
		mt.start();
		mt.interrupt();

		System.out.println("End of the main method");
	}
}
