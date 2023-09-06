package com.pardeep.Tyeion24Aug;

public class ImmutableClass {
 public static void main(String[] args) {
	String str="ABC";
	System.out.println("After First Step "+ str);
	str =  str.concat("---asdf");
	System.out.println("After Second Step -"+ str);
	
	StringBuilder sb=new StringBuilder("asdfa");
	System.out.println("SB -- After First Step "+ sb);
	sb.append("Ad");
	System.out.println("SB-- After Second Step "+ sb.toString());
	
	
}
}
