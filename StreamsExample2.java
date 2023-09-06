package com.pardeep.Tyeion24Aug;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample2 {
		public static void main(String[] args) {
			List<String> shoppingList= new ArrayList<>();
			shoppingList.add("coffee");
			shoppingList.add("bread");
			shoppingList.add("pineapple");
			shoppingList.add("milk");
			shoppingList.add("pasta");
			
			Stream<String> ShoppingListStream = shoppingList.stream();
			ShoppingListStream.sorted().map(item->  item.toUpperCase()).
			filter(item-> item.startsWith("P")).forEach(item->System.out.println(item));			
		
			//Now this should throw Exception
			ShoppingListStream.forEach(item->System.out.println(item));
		}
}
