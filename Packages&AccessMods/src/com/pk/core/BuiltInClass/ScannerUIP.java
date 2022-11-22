package com.pk.core.BuiltInClass;

import java.util.Scanner;

public class ScannerUIP {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int Num1 = In.nextInt();
		System.out.println("Enter 2nd Number");
		int Num2 = In.nextInt();

		System.out.println(Num1 + Num2);
	}

}
