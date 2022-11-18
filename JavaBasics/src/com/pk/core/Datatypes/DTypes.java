package com.pk.core.Datatypes;

public class DTypes {
	public static void main(String[] args) {
		byte a1 = -128;
		byte a2 = 127;

		short b1 = 32767;
		short b2 = -32768;

		int c1 = 2147483647;
		int c2 = -2147483648;

		char d1 = 0;
		char d2 = 65535;

		boolean e1 = true;
		boolean e2 = false;

		long f = 2147483647l;
		float g = 1.23f;

		double h = 1234567.987654321;

		System.out.println("Data types " + "\n" + a1 + "\n" + a2 + "\n" + b1 + "\n" + b2 + "\n" + c1 + "\n" + c2 + "\n"
				+ d1 + "\n" + d2 + "\n" + e1 + "\n" + e2 + "\n" + f + "\n" + g + "\n" + h);
	}
}
