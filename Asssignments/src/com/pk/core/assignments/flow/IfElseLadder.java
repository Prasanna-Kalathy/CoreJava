package com.pk.core.assignments.flow;

import java.util.Scanner;

public class IfElseLadder {
	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter Maths Mark");
		int M = In.nextInt();
		System.out.println("Enter Physics Mark");
		int P = In.nextInt();
		System.out.println("Enter Chemistry Mark");
		int C = In.nextInt();

		int tot = (M + P + C);
		int avg = tot / 3;
		if (M >= 35 && P >= 35 && C >= 35) {
			System.out.println("You Passed the exam");
			if (avg <= 59) {
				System.out.println("You're grade is C" + " and Your total is " + tot + " Marks");
			} else if (avg <= 69) {
				System.out.println("You're grade is B" + " and Your total is " + tot + " Marks");
			} else {
				System.out.println("You're grade is A" + " and Your total is " + tot + " Marks");

			}
		} else {
			System.out.println("You're failed" + " and Your total is " + tot + " Marks");
		}
	}
}
