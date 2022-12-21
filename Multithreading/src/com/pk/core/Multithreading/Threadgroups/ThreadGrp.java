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
	}

}
