package com.pk.Collections.Set;

import java.util.LinkedHashSet;
import java.util.Random;

public class TypesOfHashSet {

	public static void main(String[] args) {
		Random rnd = new Random();
		
		LinkedHashSet<Integer> Hset = new LinkedHashSet<>();
		
		for (int i = 0; i <= 5; i++) {
			int num = rnd.nextInt(10);
			Hset.add(num);	
			System.out.println(num);
		}
		System.out.println("Hash Set: "+Hset);
	}
}
