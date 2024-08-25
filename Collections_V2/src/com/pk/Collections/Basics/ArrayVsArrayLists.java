package com.pk.Collections.Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVsArrayLists {
	public static void main(String[] args) {
		// Array prints Objects
		int[] array = { 1, 2, 3, 4, 5 };
		System.out.println(array);
		// Array Lists print values
		List<Integer> ArrLst = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println(ArrLst);
	}
}
