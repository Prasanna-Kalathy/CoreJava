package com.pk.core.Multithreading.sync.ClassLock;

public class Display { // Display Class
	public synchronized static void SayHello(String name) {// marked synchronized method passes user name
		for (int i = 1; i <= 10; i++) {
			System.out.println("Hello " + name); // greets user
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
