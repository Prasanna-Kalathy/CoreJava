package com.pk.core.Exceptions;

public class MultiCatch {

	public static void main(String[] args) {
		try {
			String input = args[0];
			System.out.println("Input is: " + input);
			int output = Integer.parseInt(input);
			System.out.println("Output is: " + output);
//		} catch (Exception e) {					// It is already handled by the catch block for Exception
		} catch (ArithmeticException e) {
			System.out.println("Runtime input is required");
		}catch (RuntimeException e) {
			System.out.println("Enter only Number");
		}
		finally {
			System.out.println("All the resorces are closed");
		}
		System.out.println("More code goes here");

	}

}
