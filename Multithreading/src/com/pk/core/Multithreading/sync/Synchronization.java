package com.pk.core.Multithreading.sync;

public class Synchronization {
	public static void main(String[] args) {
		//create objects of Display class and the thread class
		Display d = new Display();
		MyThread m1 = new MyThread(d, "Naruto");
		MyThread m2 = new MyThread(d, "Sasuke");
		m1.start();
		m2.start();
	}
}
