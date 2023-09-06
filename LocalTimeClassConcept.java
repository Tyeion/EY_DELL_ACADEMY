package com.pardeep.Tyeion28Aug;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class LocalTimeClassConcept {
  public static void main(String[] args) {
	LocalDate today=LocalDate.now();
	System.out.println("Current System date is "+today);
	
	LocalDate indiaDate= LocalDate.now(ZoneId.of("Asia/Kolkata"));
	System.out.println("Current India Date is " + indiaDate);
	
	LocalDate usDate = LocalDate.now(ZoneId.of("US/Central"));
	System.out.println("Current India Date is "+ usDate);
	
	LocalDate firstdayof2023=LocalDate.of(2023,Month.JANUARY, 1);
	System.out.println("First Day of 2023 is "+ firstdayof2023);
	
//	LocalDate feb=LocalDate.of(2023,Month.JANUARY);
//	System.out.println("First Day of 2023 is "+ firstdayof2023);
	
	LocalDate epochDay= LocalDate.ofEpochDay(1000);
	System.out.println("1000th day from epoch date is "+ epochDay);
	
	LocalDate hundredth_Day_of_2020= LocalDate.ofYearDay(2020, 100);
	System.out.println("100th day from epoch date is "+ hundredth_Day_of_2020);
}
}
