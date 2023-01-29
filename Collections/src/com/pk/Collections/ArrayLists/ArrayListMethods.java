package com.pk.Collections.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		for (int i = 10; i <= 100; i+=10) {
			al.add(i);
		}
		System.out.println(al);
		System.out.println(al.size());
		al.add(3, 200);
		System.out.println(al);
		System.out.println(al.size());
		al.set(3, 300);
		System.out.println(al);
		System.out.println(al.size());
	}
}
