package com.pk.Collections.Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		//Ordered with Duplicates
		List<String> StrArr = new ArrayList<>
		(Arrays.asList("Alpha","Beta","Alpha","Delta","Beta"));
		System.out.println("List : "+StrArr);
		System.out.println(StrArr.get(2));
		
		//UnOrdered without Duplicates (No index)
		Set<String> StrSet = new HashSet<>(StrArr);
		System.out.println("Set : "+StrSet);
		//Can't access since there is no index
	}

}
