package com.pk.core.Multithreading;

public class SingleThread {
	public static void main(String[] args) {
		SingleThread st = new SingleThread();
		st.printNumber();
		System.out.println();
		for (int j = 0; j <= 100; j++) {
			System.out.print("j: " + j + "\t");
		}
	}

	void printNumber() {
		for (int i = 0; i <= 100; i++) {
			System.out.print("i: " + i + "\t");
		}
	}
}
