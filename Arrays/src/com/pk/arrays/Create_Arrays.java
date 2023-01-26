package com.pk.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Create_Arrays {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter a Size of Array");
		int size = In.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the " + i + " Element");
			a[i] = In.nextInt();
		}

		int[] b = { 1, 2, 3, 4, 5 };
		int[] c = Arrays.copyOf(b, 3);
		int[] d = b.clone();
		int[] e = new int[5];
		System.arraycopy(b, 2, e, 0, 3);

		
		for(int i :a) {
			System.out.print(i+" ");
		}
		for(int i :b) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i :c) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i :d) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i :e) {
			System.out.print(i+" ");
		}
	}

}
