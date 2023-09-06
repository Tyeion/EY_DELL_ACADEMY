package com.pardeep.Tyeion22Aug;

import java.util.HashMap;

//a,e,i,o,u
public class PrintNextVowelInString {

	public static void main(String[] args) {
		String str= "amitThakur";
		System.out.println("Next Vowel String is ");
		System.out.println(printNextVowel(str.toCharArray()));
	}
	
	public static String printNextVowel(char[] str)
	{
	   HashMap<Character, Integer> hmap=new HashMap<>();
	   hmap.put('a', 0);
	   hmap.put('e', 1);
	   hmap.put('i', 2);
	   hmap.put('o', 3);
	   hmap.put('u', 4);
	   char[] arr= {'a','e','i','o','u'};
	   int lengthOfString=str.length;

	   for(int i=0;i<lengthOfString ;i++)
	   {
		   char c=str[i];
//		   System.out.println("Character is "+ c);
		   if(c == 'a' || c == 'e' || c == 'i' || c == 'o' ||  c == 'u')
		   {
			   int index=hmap.get(c)+1;
			   int newIndex=index%5;
			   
			   str[i]=arr[newIndex];
		   }
	   }
		return String.valueOf(str);
	}
}
