package com.pk.regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartEnd {

	public static void main(String[] args) {
		String Sentence = "Thupparku thuppaya thuppakki thupparkuThuppaya thoovum mazhai";
		Pattern p1 = Pattern.compile("^Thuppa"); //Starts with - ^
		Pattern p2 = Pattern.compile("mazhai$"); // Ends with - $
		
		Pattern p3 = Pattern.compile("Thuppa|thuppa"); // Finds both the given words | (or)
		Pattern p4 = Pattern.compile("(T|t)huppa"); // Same as before but in more concise manner
				
		Matcher m = p4.matcher(Sentence);
		while(m.find()) {
			System.out.println(m.group()+" Starts at "+m.start());
		}
		
	}

}
