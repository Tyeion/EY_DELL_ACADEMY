package com.pardeep.Tyeion28Aug;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat {
  public static void main(String[] args) {
	LocalDate today=LocalDate.now();
	System.out.println("Default format is "+ today);
	
	System.out.println("According to Pattern 1 "+ today.format(DateTimeFormatter.ofPattern("d::MM::uuuu")));
	
	System.out.println("According to Pattren 2" + today.format(DateTimeFormatter.BASIC_ISO_DATE));
	
	LocalDateTime datetime=LocalDateTime.now();
	
	System.out.println("Current Date with timeStamp is "+ datetime);
	System.out.println("According to Pattern 2 " + datetime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));
	
}
}
