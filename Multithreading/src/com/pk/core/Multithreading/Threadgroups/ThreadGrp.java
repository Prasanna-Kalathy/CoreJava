package com.pk.core.Multithreading.Threadgroups;

public class ThreadGrp {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup());
		System.out.println(Thread.currentThread().getThreadGroup().getParent());
		
		System.out.println();
		
		ThreadGroup WS = new ThreadGroup("Wind Style");
		System.out.println(WS.getName());
		
		ThreadGroup RS = new ThreadGroup(WS,"Rasengan");
		System.out.println(RS.getName());
		System.out.println(RS.getParent().getName());
		
		System.out.println();
		
		Thread t1 = new Thread(RS, "Thread 1");
		Thread t2 = new Thread(RS, "Thread 2");
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t1.getPriority());
		RS.setMaxPriority(2);
		Thread t3 = new Thread(RS, "Thread 3");
		System.out.println(t3.getPriority());
		
		
	}

}
