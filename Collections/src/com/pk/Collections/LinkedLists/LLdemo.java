package com.pk.Collections.LinkedLists;

import java.util.ArrayList;
import java.util.List;

public class LLdemo {

	public static void main(String[] args) {
		Object objects[] = new Object[1000000];		//Creating an empty array of 1m size 

		for (int i = 0; i < objects.length; i++) {	//adding null objects to the array
			objects[i] = new Object();
		}

		List<Object> list = new ArrayList<>();
		long start = System.currentTimeMillis();
		for (Object object : objects) {
			list.add(object);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time Taken:" + (end - start));

	}

}
