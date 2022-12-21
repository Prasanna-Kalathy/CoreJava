package com.pk.core.Multithreading.daemon;

public class DaemonDemo {

	public static void main(String[] args) {
		System.out.println("Is main a Deamon Thread: " + Thread.currentThread().isDaemon());

		Mythread mt = new Mythread();
		
		mt.setDaemon(true);
		System.out.println("Is My Thread a Deamon Thread: " + mt.isDaemon());
		
		mt.start();
	}

}
