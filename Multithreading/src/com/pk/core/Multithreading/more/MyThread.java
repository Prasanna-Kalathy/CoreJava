package com.pk.core.Multithreading.more;

public class MyThread extends Thread {
	DisplayMessage dm;
	String name;

	MyThread(DisplayMessage dm, String name) {
		this.dm = dm;
		this.name = name;
	}

	public MyThread() {
		// TODO Auto-generated constructor stub
	}

	public void run() {
		dm.sayHello(name);
	}
}
