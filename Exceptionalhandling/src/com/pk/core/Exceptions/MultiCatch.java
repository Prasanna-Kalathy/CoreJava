package com.pk.core.Exceptions;

public class MultiCatch {

	public static void main(String[] args) {
		try {
			String input = args[0];
			System.out.println("Input is: " + input);
			int output = Integer.parseInt(input);
			System.out.println("Output is: " + output);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Runtime input is required");
		}catch (NumberFormatException e) {
			System.out.println("Enter only Number");
		}
		System.out.println("More code goes here");

	}

}
