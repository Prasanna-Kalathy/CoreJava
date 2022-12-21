package com.pk.core.Multithreading.threadCom;

public class ThreadMain {

	public static void main(String[] args) {
		ThreadComm tc = new ThreadComm();
		tc.start();

		synchronized (tc) {
			try {
				System.out.println(tc.total+" Before the join method");
				tc.join();
				System.out.println("The main thread notified");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(tc.total);
		}
	}

}
