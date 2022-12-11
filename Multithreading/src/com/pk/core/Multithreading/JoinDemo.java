package com.pk.core.Multithreading;

import java.util.Scanner;

public class JoinDemo extends Thread {
	static int n, sum = 0;

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		System.out.println("sum of first 'N' numbers");
		System.out.println("enter the value");
		Scanner In = new Scanner(System.in);
		JoinDemo.n = In.nextInt();

		JoinDemo jd = new JoinDemo();
		jd.start();
		try {
			jd.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Sum of first " + JoinDemo.n + " Number is " + JoinDemo.sum);
		long end = System.currentTimeMillis();
		
		System.out.println("The Total time taken "+(end - start)/1000+" Seconds");
	}

	@Override
	public void run() {
		for (int i = 1; i <= JoinDemo.n; i++) {
			JoinDemo.sum += i;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
