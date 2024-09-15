package com.pk.regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharcterClasses {

	public static void main(String[] args) {
		String str = "aabcb4565ksb!@#$%^&*()_+abcda";
		Pattern p1 = Pattern.compile("[abc]");  //Check either a or b or c in a char sequence
		Pattern p2 = Pattern.compile("[^abc]");  //Checks Except a,b, and c in a char sequence
		Pattern p3 = Pattern.compile("[c-s]");  //Checks inclusive range between c and s in a char sequence
		Pattern p4 = Pattern.compile("[^c-s]");  //Checks Except the inclusive range between c and s in a char sequence
		Pattern p5 = Pattern.compile("^[c-s]");  //Checks inclusive range between c and s at start of the given sentence
		Pattern p6 = Pattern.compile("[a-bd-l0-9]");  //Checks inclusive range between a,b and d,l and numbers from 0 to 9 in a char sequence
		Pattern p7 = Pattern.compile("[a-zA-Z^0-9]");  //All Characters except alpha numeric values will be printed
		
		
		
		
		Matcher m = p7.matcher(str);
		while(m.find()) {
			System.out.println(m.group()+" Starts at "+m.start());
		}
	}

}
