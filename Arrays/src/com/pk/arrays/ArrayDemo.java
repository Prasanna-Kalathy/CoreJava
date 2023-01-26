package com.pk.arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int a[] = new int[5];
		String s[] = new String[3];
		System.out.println("int Array");
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();

		System.out.println("String Array");
		for (String i : s) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}

}
