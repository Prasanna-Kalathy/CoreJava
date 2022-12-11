package com.pk.core.Multithreading.runnable;

public class RunnableThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Processed the checks");
	}

	public static void main(String[] args) {
		RunnableThread rt = new RunnableThread();

		Thread t = new Thread(rt);
		t.start();
	}
}
