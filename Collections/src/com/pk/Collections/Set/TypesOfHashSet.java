package com.pk.Collections.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class TypesOfHashSet {

	public static void main(String[] args) {
		Random rnd = new Random();
		
		HashSet<Integer> Hset = new HashSet<>();
		
		for (int i = 0; i <= 5; i++) {
			int num = rnd.nextInt(10);
			Hset.add(num);	
			System.out.println(num);
		}
		System.out.println("Hash Set: "+Hset);
	}

}
