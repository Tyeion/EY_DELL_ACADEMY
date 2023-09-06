package com.pardeep.Tyeion25Aug;

import java.util.regex.Pattern;

// ? - once or not at all
// + occur once or more than
// * zero  or more than once
// (n) time only
public class QuantifyClassInRegex {
	public static void main(String[] args) {
		System.out.println(Pattern.matches("[amn]?","a")); //true
		System.out.println(Pattern.matches("[amn]?","z")); //false
		System.out.println(Pattern.matches("[amn]?","am")); //false
		System.out.println(Pattern.matches("[amn]?","")); //true
		
		//+ -- a or m or n -once or  more than once
		System.out.println(Pattern.matches("[amn]+","aaaamndfghjk")); //true
		System.out.println(Pattern.matches("[amn]+","aaaammm")); //true
		System.out.println(Pattern.matches("[amn]?","aaammmooo")); //false
		
		//* -- a or m or n - zero or more than once
		System.out.println(Pattern.matches("[amn]*", "z")); //false
		System.out.println(Pattern.matches("[amn]*","aaaammmm")); //true
		
		
	}
}
