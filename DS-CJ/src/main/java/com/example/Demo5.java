package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo5 {

	public static void main(String[] args) {
		
		String sampleString = "aJffffffff  98734509347590345809348 fffJ34_-   ";
		String regex = "[a-zA-Z 0-9 _-]*";
		
		try {
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(sampleString);
			System.out.println(matcher.matches());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
