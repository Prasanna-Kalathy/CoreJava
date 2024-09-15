package com.pk.Collections.Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListsDemo {

	public static void main(String[] args) {
		// Default Capacity of 10
		List<String> ArrDfltLst = new ArrayList<>();
		
		// Custom Capacity
		List<String> ArrCustLst = new ArrayList<>(20);
		
		// Initialization with Values
		List<String> ArrValsLst = new ArrayList<>(Arrays.asList("A","B","C"));
		
		// Initialization with Existing Collections
		List<String> ArrColLst = new ArrayList<>(ArrValsLst);
		
		
		List<String> ArrLst = ArrColLst;
		System.out.println(ArrLst);
		System.out.println(ArrLst.size());
	}
}
