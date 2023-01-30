package com.pk.Collections.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Random rdm = new Random();
		
		ArrayList<Integer> arl = new ArrayList<>();
		
		for(int i =1; i<=10; i++) {
			int num = rdm.nextInt(5);
			arl.add(num);
		}
		System.out.println(arl);
		
		Set<Integer> st = new HashSet<>(arl);
		System.out.println(st);
	}

}
