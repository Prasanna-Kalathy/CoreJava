package com.pk.core.Multithreading.threadCom;

public class ThreadComm extends Thread {
	int total;

	@Override
	public void run() {
		System.out.println("The Child Thread is calculating the sum: ");
		synchronized (this) {
			for (int i = 1; i <= 100; i++) {
				total += i;
			}
		}
	}
}
