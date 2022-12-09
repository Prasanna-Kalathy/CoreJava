package com.pk.core.Exceptions;

import java.util.Scanner;

public class DivisionException {

	public static void main(String[] args) {
		int a, b, c;

		try {
			Scanner In = new Scanner(System.in);
			System.out.println("Enter Number 1");
			a = In.nextInt();
			System.out.println("Enter Number 2");
			b = In.nextInt();
			c = a / b;
			System.out.println("Result " + c);
		} catch (ArithmeticException e) {
			System.out.println("A Number Can't be Divided by Zero");
		} finally {
			System.out.println("All the resorces are closed");
		}
		System.out.println("Further Coding after the divison completed");

	}

}
