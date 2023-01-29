package com.pk.Collections.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		for (int i = 10; i <= 50; i += 10) {
			al.add(i);
		}
		System.out.println(al);
		System.out.println(al.size());
		for (int i = 50; i <= 100; i += 20) {
//			al.add(al.size()-1, i);
			al.add(2,i);
		}
		System.out.println(al);
		System.out.println(al.size());
		al.set(3, 300);
		System.out.println(al);
		System.out.println(al.size());
	}
}
