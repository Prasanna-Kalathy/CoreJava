package com.pk.arrays;

public class TwoD_Arrays {

	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		for (int i[] : arr) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
