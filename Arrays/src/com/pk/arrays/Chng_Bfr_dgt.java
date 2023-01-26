package com.pk.arrays;

import java.util.Scanner;

public class Chng_Bfr_dgt {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = In.nextInt();
		int[] arr = { 2, 3, 8, 5, 3, 5, 5 };
		for (int i=0; i < arr.length; i++) {
			if (arr[i] == num) {
				arr[i + 1] = 0;
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
