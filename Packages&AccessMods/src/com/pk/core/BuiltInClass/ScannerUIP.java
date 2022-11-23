package com.pk.core.BuiltInClass;

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.Integer.*;

public class ScannerUIP {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		out.println("Enter 1st Number");
		int Num1 = In.nextInt();
		out.println("Enter 2nd Number");
		int Num2 = In.nextInt();

		out.println(Num1 + Num2);
	}

}
