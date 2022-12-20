package com.pk.core.Multithreading.sync.blocks;

//Our_Thread class extends Thread class
public class MyThread extends Thread {
	// create object of the display class to call the non static method
	Display D = new Display();
	// variable to store the user name
	String S;

	// since we are using this object for multiple threads and need to pass
	// parameters we need to create constructor for accepting values for each thread
	public MyThread(Display D, String S) {
		this.D = D;
		this.S = S;
	}
	//overriding run method and calling the method from he parent object
	@Override
	public void run() {
		D.SayHello(S);		//using the received parameters to call the method and pass parameters 
	}
}
