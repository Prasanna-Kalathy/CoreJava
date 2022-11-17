package com.pk.core.Refrences;

public class ThisKeyword {
	int a;

	ThisKeyword() {
		System.out.println(this);
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		new ThisKeyword();
		new ThisKeyword();

	}
}