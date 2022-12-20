package com.pk.core.Multithreading.sync.blocks;

public class Display { // Display Class
	public void SayHello(String name) {// marked synchronized method passes user name
		System.out.println("Before synchronized block");
		synchronized (Display.class) {
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
}
