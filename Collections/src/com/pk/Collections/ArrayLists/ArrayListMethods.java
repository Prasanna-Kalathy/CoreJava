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
			al.add(2, i);
		}
		System.out.println(al);
		System.out.println(al.size());
		al.set(3, 300);
		System.out.println(al);
		System.out.println(al.size());

		List<Integer> al2 = new ArrayList<>();
		al2.add(111);
		al2.add(222);
		al2.add(333);
		System.out.println(al2);

		al2.addAll(2, al);
		System.out.println(al2);
		System.out.println(al);

		if (al2.contains(222)) {
			System.out.println("Found");
		} else
			System.out.println("Not Found");

		if (al2.containsAll(al)) {
			System.out.println("Found");
		} else
			System.out.println("Not Found");

	}
}
