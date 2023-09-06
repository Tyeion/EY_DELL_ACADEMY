package com.pardeep.Tyeion22Aug;

//import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildCard {
public static void main(String[] args) {
	List<Integer> listInt=new ArrayList<>();
	listInt.add(123);
	listInt.add(678);
	listInt.add(456);
	printListItems(listInt);
	System.out.println("Decimal (integer)");
	
	List<Number> listfloat=new ArrayList<Number>();
	listfloat.add(14.90f);
	listfloat.add(78.98f);
	listfloat.add(98.7f);
	printListItems(listfloat);
	System.out.println("Decimal (float)");
	
	List<Double> listDouble=new ArrayList<Double>();
	listDouble.add(11.3D);
	listDouble.add(53.8D);
	listDouble.add(89.76);
//	printListItems(listDouble);
}
 static void printListItems(List<? super Integer> list)
 {
	 for(Object num: list)
	 {
		 System.out.print(num+ " ");
	 }
 }

}
