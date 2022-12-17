package com.pk.core.Multithreading.more;

public class Synchronization {

	public static void main(String[] args) {
		DisplayMessage dm = new DisplayMessage();

		MyThread t1 = new MyThread(dm, "Steve");
		MyThread t2 = new MyThread(dm, "Mark");

		t1.start();
		t2.start();

	}

}
