package com.pk.core.Exceptions;

public class StringParser {

	public static void main(String[] args) {
		String s = "absd";
		try {
			int i = Integer.parseInt(s);
			System.out.println(i);
		} catch (Exception e) {
			System.out.println("Enter Proper Number for Parsing into integer ");
		}
	}

}
