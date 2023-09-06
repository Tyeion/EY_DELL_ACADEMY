package com.pardeep.Tyeion28Aug;

import java.util.Date;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class NumberFormatAPI {
 public static void main(String[] args) {
	long number = 50000L;
	NumberFormat nf=NumberFormat.getInstance();
	System.out.println("Number Format using Default Locale is "+ nf.format(number));
	
	NumberFormat italyNF= NumberFormat.getInstance(Locale.ITALY);
	System.out.println("Number Format using Italy Locale is "+italyNF.format(number));
	
	NumberFormat defaultCurrency=NumberFormat.getInstance();
	System.out.println("Number Format using default currency "+ defaultCurrency.format(number));
	
	NumberFormat usingItalianCurrency = NumberFormat.getCurrencyInstance(Locale.ITALY);
	System.out.println("Number format using italy locale is "+ usingItalianCurrency);
	
	Currency usd= Currency.getInstance("USD");
	NumberFormat usCurrency = NumberFormat.getCurrencyInstance(Locale.US);
	
	System.out.println("Number Format using Italy Locale is "+ usCurrency.format(12354));
	
	Date currentDate=new Date();
	DateFormat germanDF=DateFormat.getDateInstance(DateFormat.FULL ,Locale.GERMANY);
	System.out.println("Date Format using Germany Locale is "+germanDF.format(currentDate));
}
}
