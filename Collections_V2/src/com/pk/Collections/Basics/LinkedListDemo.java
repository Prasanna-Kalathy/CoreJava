package com.pk.Collections.Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		// No Default Capacity just Empty List
		List<String> DfltLnkLst = new LinkedList<>();
		
		// Trying with Custom Capacity
		//List<String> DfltCusLnkLst = new LinkedList<>(20);
		
		// Initialization with Values - Array List
		List<String> ValsArrLst = new ArrayList<>(Arrays.asList("A","B","C"));
		
		// Initialization with Existing Collections
		// Passing Arraylist to make Linked List
		List<String> ColsLnkLst = new LinkedList<>(ValsArrLst);
		
		
		List<String> ArrLst = ValsArrLst;
		System.out.println(ArrLst);
		System.out.println(ArrLst.size());
	}
}
