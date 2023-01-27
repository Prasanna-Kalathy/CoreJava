package com.pk.arrays;

public class Sum_Array {

	public static void main(String[] args) {
		int[] arr = {1,5,4,98,5,6,4,65};
		int sum =0;
		for(int i : arr) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
