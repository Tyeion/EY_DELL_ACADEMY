package com.pardeep.Tyeion25Aug;

import java.util.regex.Pattern;

public class UserNameValidation {
	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "abcd34")); //true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","abcd347")); //false
		
		//Mobile Number validation
		System.out.println(Pattern.matches("[6789]{1}[0-9]{9}", "6284443875"));
		
		//true function is only used to remove leading and trailing 
		//white spaces in String whereas with replace , you can remove
		//white spaces from which
		String str= "        Java Example Trim              Funciton         ";
		System.out.println(str.trim());
	}
}
