package com.pardeep.Tyeion24Aug;

public class NeedOfOptionalClass {
	public static void main(String[] args) {
		
	
	String [] words=new String [10];
	
	String word="";
	if(null!=words[5]) {
		word=words[5].toLowerCase();
	}else {
	System.out.print("value at 5th index was null ");
	}
	System.out.println(word);
}
}
