package com.pk.regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetaCharacters {

	public static void main(String[] args) {
		String Sentence = "Tamil TamilNadu Tamilan TamilTamil 60000152 !@#$$%";

		Pattern p = Pattern.compile("\\s"); //(space) returns the spaces in a sentence
		Pattern p2 = Pattern.compile("\\S"); //Returns all Non space characters
		
		Pattern p3 = Pattern.compile("\\d"); //(digits)
		Pattern p4 = Pattern.compile("\\D"); //except digits

		Pattern p5 = Pattern.compile("\\w"); //Alpha Numeric
		Pattern p6 = Pattern.compile("\\W"); //except Alpha Numeric (Only Special Characters)
		
		Pattern p7 = Pattern.compile("\\bTam"); //Individual words after a space
		Pattern p8 = Pattern.compile("\\bTamil\\b"); //(Exact Word) Should start with tamil and also ends with tamil
		
		Pattern p9 = Pattern.compile("Tamil\\B"); //Words starts with Tamil but can ends with anything
		Pattern p10 = Pattern.compile("."); //All characters
		
		
		Matcher m = p10.matcher(Sentence);
		while (m.find()) {
			System.out.println("Found " + m.group() + " at " + m.start());
		}
	}
}
