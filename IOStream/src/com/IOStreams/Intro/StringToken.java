package com.IOStreams.Intro;

import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		String s ="Ore, wa Uzumaki Naruto.. Datebayooo";
		StringTokenizer st = new StringTokenizer(s);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
