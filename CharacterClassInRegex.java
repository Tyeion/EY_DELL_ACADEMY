package com.pardeep.Tyeion25Aug;

import java.util.regex.Pattern;

//[abc] - a or b or c
public class CharacterClassInRegex {
		public static void main(String[] args) {
			System.out.println(Pattern.matches("[amn]", "a")); //true
			System.out.println(Pattern.matches("[amn]", "aa")); //false
			System.out.println(Pattern.matches("[amn]", "m")); //true
			System.out.println(Pattern.matches("[amn]", "mn")); //false
			System.out.println(Pattern.matches("[^amn]", "u")); //true
			//any  character except  a or m or n
			System.out.println(Pattern.matches("[a-zA-Z]", "B")); //true
			//any alphabet d or m through p
			System.out.println(Pattern.matches("[a-d[m-p]]", "e")); // false
		}
}
