package com.pk.core.Multithreading;

public class ThreadName extends Thread {

	public static void main(String[] args) throws InterruptedException {
		ThreadName mt = new ThreadName();
		mt.start();
		
		Thread ct = Thread.currentThread();
		System.out.println("Name of the Current Thread is "+ct.getName());
	}

	@Override
	public void run() {
		Thread ct = Thread.currentThread();
		System.out.println("Name of the Current Thread is "+ct.getName());
		ct.setName("Secondary Thread");
		System.out.println("Name of the Current Thread is "+ct.getName());
		
	}
}
