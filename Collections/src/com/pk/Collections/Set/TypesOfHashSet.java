package com.pk.Collections.Set;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TypesOfHashSet {

	public static void main(String[] args) {
		Random rnd = new Random();
		
		Set<Integer> Tset = new TreeSet<Integer>();
		
		for (int i = 0; i <= 5; i++) {
			int num = rnd.nextInt(10);
			Tset.add(num);	
			System.out.println(num);
		}
		System.out.println("Tree Set: "+Tset);
	}
}
