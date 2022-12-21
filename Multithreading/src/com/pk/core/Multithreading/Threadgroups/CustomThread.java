package com.pk.core.Multithreading.Threadgroups;

public class CustomThread extends Thread {
	
	CustomThread(ThreadGroup g,String name){
		super(g,name);
	}
	
	
	@Override
	public void run() {
		try {
			System.out.println("Inside Custom Thread");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
