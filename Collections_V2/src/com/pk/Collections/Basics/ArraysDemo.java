package com.pk.Collections.Basics;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// Declaring Array - Type, Name
		String[] StrEmptArr = null;
		// Instantiation after the Declaration
		StrEmptArr = new String[5];
		// Initialization after the Declaration
		StrEmptArr = new String[]{ "A", "B", "C" };

		// Declaring & Instantiating Array - Type, Name, Size
		String[] StrSizeArr = new String[5];
		// Initialization after the Declaration with size can be done only by assigning values to indexes		
		// Using Arrays class, It Fills the entire array with the given value "Auto"
		Arrays.fill(StrSizeArr,"Auto");
		
		
		// Declaring, Instantiating & Initializing Array - Type, Name, Size, Values
		String[] StrValArr = { "A", "B", "C" };

		// Changes Based on the Array
		// I want to print
		String[] StrArr = StrSizeArr;
		//Length of the Array
		System.out.println(StrArr.length);
		//Prints the Class for the Array
		System.out.println(StrArr.getClass().getName());
		// Printing Array values
		for (String Str : StrArr) {
			System.out.println(Str);
		}
		System.out.println(StrArr);
	}

}
