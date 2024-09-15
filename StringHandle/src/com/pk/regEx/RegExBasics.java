package com.pk.regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExBasics {

	public static void main(String[] args) {
		String Sentence = "Thupparku thuppaya thuppakki thupparkuThuppaya thoovum mazhai";

		Pattern p = Pattern.compile("Thuppa");
		Matcher m = p.matcher(Sentence);
		int count = 0;
		while (m.find()) {
			System.out.println("Found " + m.group() + " at " + m.start());
			count++;
		}
		System.out.println("Thuppa Appears " + count + " times");
	}

}
