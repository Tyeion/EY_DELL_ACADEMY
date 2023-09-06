package practiceJava;

import java.util.HashMap;

public class PracticePrintNextVowels {
	 private static HashMap<Character, Character> vowels = new HashMap<>();
	static {
	        vowels = new HashMap<>();
	        vowels.put('a', 'e');
	        vowels.put('e', 'i');
	        vowels.put('i', 'o');
	        vowels.put('o', 'u');
	        vowels.put('u', 'a');
	    }
   

    public static String changeVowels(String str) {
        StringBuilder newStr = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (vowels.containsKey(ch)) {
                newStr.append(vowels.get(ch));
            } else {
                newStr.append(ch);
            }
        }
        return newStr.toString();
    }

    public static void main(String[] args) {
        String str = "AmanThakur";
        System.out.println("The original string is: " + str);
        String newStr = changeVowels(str);
        System.out.println("The new string is: " + newStr);
    }
}