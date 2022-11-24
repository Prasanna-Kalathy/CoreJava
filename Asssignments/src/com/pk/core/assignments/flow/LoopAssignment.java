package com.pk.core.assignments.flow;

import java.util.Scanner;

public class LoopAssignment {
	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = In.nextInt();

		for (int i = 1; i < num; i++) {
			if (i > 100) {
				break;
			} else if ((i % 10) == 0) {
				continue;
			} else {
				System.out.println(i);
			}
		}
	}
}
