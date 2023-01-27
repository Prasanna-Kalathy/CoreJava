package com.pk.arrays;

public class CharArray {

	public static void main(String[] args) {
		char[] c = {'a','e','i','o','u'};
		if(c[0] == c[c.length-1]) {
			System.out.println("First and last elements are same");
		}else {
			System.out.println("First and last elements are Not same");
		}
	}

}
