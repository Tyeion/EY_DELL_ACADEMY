package practiceJava;

import java.util.HashMap;

public class PracticeprintNextVowel {

	public static void main(String[] args) {
		
	
	String str="PARDEEP";
	str=str.toLowerCase();
	String newStr= nextVowel(str.toCharArray());
	newStr=newStr.toUpperCase();
	System.out.println(newStr);
	}
	
	public static String nextVowel(char [] str)
	{
		HashMap<Character, Integer> hMAp=new HashMap<Character, Integer>();
		hMAp.put('a',0);
		hMAp.put('e',1);
		hMAp.put('i', 2);
		hMAp.put('o', 3);
		hMAp.put('u', 4);
		int lengthOfString= str.length;
		char []arr= {'a','e','i','o','u'};
		
		for(int i=0;i<lengthOfString;i++)
		{
			char c=str[i];
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			{
				int index=hMAp.get(c)+1;
				int newIndex=index%5;
				
				
				str[i]=arr[newIndex];
			}
				
		}
		
			return String.valueOf(str);
		}
		
	
}
