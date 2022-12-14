package com.pk.core.Multithreading.yield;

public class Interrupt extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println("lAzy Thread");
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
	}
}
