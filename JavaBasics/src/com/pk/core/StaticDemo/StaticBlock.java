package com.pk.core.StaticDemo;

public class StaticBlock {
	public static void main(String[] args) {
		System.out.println("Inside Main");
	}
	static {
		System.out.println("Inside Static 1");
	}
	static {
		System.out.println("Inside Static 2");
	}
}
