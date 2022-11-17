package com.pk.core.StaticNonStatic;

public class StaticVar {
	static int a;

	public static void main(String[] args) {
		a = 4;
		System.out.println(StaticVar.a); // a is 4 here (Local)
	}

	static {
		System.out.println(StaticVar.a); // a is 0 here (Static,Global)
	}
}
