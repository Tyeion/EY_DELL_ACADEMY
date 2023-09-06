package com.pardeep.Tyeion24Aug;

import java.util.Optional;

public class UseOfOptionalClass {
	public static void main(String[] args) {
		
	
	String[] words=new String[10];
	
		Optional<String> checkNul = Optional.ofNullable(words[5]);
		
		if(checkNul.isPresent())
		{
			String word=words[5].toLowerCase();
			System.out.println(word);
		}else {
			System.out.print("Word is null");
		}
}
}
