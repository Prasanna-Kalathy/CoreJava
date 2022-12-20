package com.pk.core.Multithreading.sync.ClassLock;

//Our_Thread class extends Thread class
public class MyThread extends Thread {
	//since the method is static we don't need to create an object to call them
	//	Display D = new Display();
	// variable to store the user name
	String S;

	// since we are using this object for multiple threads and need to pass
	// parameters we need to create constructor for accepting values for each thread
	public MyThread(String S) {
		this.S = S;
	}
	//overriding run method and calling the method from he parent object
	@Override
	public void run() {
		Display.SayHello(S);		//using the received parameters to call the method and pass parameters 
	}
}
