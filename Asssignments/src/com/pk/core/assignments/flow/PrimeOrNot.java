package com.pk.core.assignments.flow;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = In.nextInt();

		boolean primeFlag = true;

		for (int i = 2; i < (num - 1); i++) {
			if (num % i == 0) {
				primeFlag = false;
			}
		}
		String result = (primeFlag == true) ? "prime number" : "Composite number";
		System.out.println(result);
	}
}
