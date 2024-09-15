package com.pk.regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {

	public static void main(String[] args) {
		String Sentence = "aabcb45655ksb!@#$%^&*( )_+aaaabcda60000152!@#$$%";
		Pattern p = Pattern.compile("5+"); // One or more occurrence of the given string
		Pattern p1 = Pattern.compile("5*"); // Any number of match including not available places
		Pattern p2 = Pattern.compile("5?"); // Atmost one match and the not available places 
		Pattern p3 = Pattern.compile("a{3}"); // Number of occurrences for the given amount of repeated characters
		Pattern p4 = Pattern.compile("a{2,4}"); // Number of occurrences from 2 to 4 for the given amount of repeated characters
		
		Matcher m = p4.matcher(Sentence);
		while (m.find()) {
			System.out.println("Found " + m.group() + " at " + m.start());
		}
	}

}
