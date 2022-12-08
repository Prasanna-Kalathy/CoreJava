package com.pk.core.Exceptions;

public class ArrayIOOB {
	public static void main(String[] args) {
		int ary[] = { 45, 98, 65 };

		try {
			System.out.println("Elementts in the array are ");
			for (int i = 0; i <= ary.length; i++) {
				System.out.println(ary[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index Beyond Array Length");
		}

		System.out.println("Code after Array output");
	}

	public void display() {
		System.out.println("In ArryIOOB class");
	}
}
