package com.pk.core.Multithreading.Threadgroups;

public class ThreadGrpMeths {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Inside main thread");
		ThreadGroup mtg = new ThreadGroup("My Parent Group");
		ThreadGroup mtg1 = new ThreadGroup(mtg,"My Child Group");
		
		
		CustomThread t1 = new CustomThread(mtg, "Thread1");
		CustomThread t2 = new CustomThread(mtg, "Thread2");
		CustomThread t3 = new CustomThread(mtg1, "Thread3");
		
		t1.start();
		t2.start();
		t3.start();
		
		
		System.out.println(mtg.activeCount());
		System.out.println(mtg.activeGroupCount());
		mtg.list();
		
		Thread.sleep(2000);
		System.out.println(mtg.activeCount());
		mtg.list();
	}

}
