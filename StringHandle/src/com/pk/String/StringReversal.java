package com.pk.String;

public class StringReversal {

	public String Stringrev(StringBuilder s) {
		s=s.reverse();
		return s.toString();
	}
	public static void main(String[] args) {
		StringBuilder s=  new StringBuilder("Naruto");
		StringReversal sr = new StringReversal();
		System.out.println(sr.Stringrev(s));
	}
}
