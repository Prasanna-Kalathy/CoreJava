package com.pk.core.Switch;

public class SwitchFall {
	public static void main(String[] args) {
		int s = 2;
		switch (s) {
		case (1):
		case (2): {
			System.out.println("Common Logic");
			break;
		}
		default: {
			System.out.println("None");
		}
		}
	}
}
