package com.pk.core.Multithreading;

public class Multithreading extends Thread {

	public static void main(String[] args) {
		Multithreading mt = new Multithreading();
		mt.start();
		System.out.println("between loops");
		for (int j = 0; j <= 100; j++) {
			System.out.print("j: " + j + "\t");
		}
		System.out.print("After loops ");
	}

	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.print("i: " + i + "\t");
		}
	}

}
