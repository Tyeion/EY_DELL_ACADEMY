package com.pardeep.Tyeion24Aug;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class UseOfStreams {
  public static void main(String[] args) {
	ArrayList<String> countries=new ArrayList<String>();
	countries.add("India");
	countries.add("United States");
	countries.add("China");
	
	Collections.sort(countries);
	for(String country:countries) {
		country=country.toUpperCase();
		if(!country.startsWith("C")) {
			System.out.println("Country naem not starting with C---" + country);
		}	
		}

	//same thing but with streams oonly
	countries.stream().map(s->s.toUpperCase()).filter(s->!s.startsWith("C")).sorted()
	.forEach(s->System.out.println(s));
}
}
