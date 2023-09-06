package com.pardeep.Tyeion28Aug;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleAPIUsage {
 public static void main(String[] args) {
	ResourceBundle rs=ResourceBundle.getBundle("com.pardeep.Tyeion28Aug.TestBundle");
	displayValue(rs);
	
	Locale swedishLocale=new Locale("sv","SE");
	ResourceBundle rs2=ResourceBundle.getBundle("com.pardeep.Tyeion28Aug.TestBundle", swedishLocale);
	displayValue(rs2);
}
 
 static void displayValue(ResourceBundle bundle) {
  System.out.println("Hello Mesaage : "+ bundle.getString("my.hello"));
  System.out.println("Hello Message : "+ bundle.getString("my.bye"));
  System.out.println("Hello Message : "+ bundle.getString("my.question"));
 }
 
}
