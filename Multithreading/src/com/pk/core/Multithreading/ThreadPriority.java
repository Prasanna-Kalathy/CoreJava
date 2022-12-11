package com.pk.core.Multithreading;

public class ThreadPriority extends Thread {

	public static void main(String[] args) throws InterruptedException {
		ThreadPriority mt1 = new ThreadPriority();
		mt1.setPriority(MIN_PRIORITY);
		mt1.setName("MT1");
		mt1.start();
		
		ThreadPriority mt2 = new ThreadPriority();
		mt2.setPriority(NORM_PRIORITY);
		mt2.setName("MT2");
		mt2.start();
		
		ThreadPriority mt3 = new ThreadPriority();
		mt3.setPriority(NORM_PRIORITY);
		mt3.setName("MT3");
		mt3.start();
	}

	@Override
	public void run() {
		System.out.println("Name of the Current Thread is "+currentThread().getName());
		
	}
}
