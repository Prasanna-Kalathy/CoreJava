package com.pk.Collections.Basics;

public class Arrays {

	public static void main(String[] args) {
		// Declaring Array - Type, Name
		String[] StrEmptArr = null;
		// Instantiation after the Declaration
		StrEmptArr = new String[5];
		// Initialization after the Declaration
		StrEmptArr = new String[]{ "A", "B", "C" };

		// Declaring & Instantiating Array - Type, Name, Size
		String[] StrSizeArr = new String[1];
		// Initialization after the Declaration with size can be done only by assigning values to indexes		

		// Declaring, Instantiating & Initializing Array - Type, Name, Size, Values
		String[] StrValArr = { "A", "B", "C" };

		// Changes Based on the Array
		// I want to print
		String[] StrArr = StrSizeArr;
		// Printing Array values
		for (String Str : StrArr) {
			System.out.println(Str);
		}
		System.out.println(StrArr);
	}

}
