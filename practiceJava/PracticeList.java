package practiceJava;

import java.util.LinkedList;
import java.util.ListIterator;

//Every list works same so i'll be doing with LinkedList
public class PracticeList {

	public static void main(String[] args) {
		PracticeCollections p=new PracticeCollections("Pardeep", "Kumar", 21, 4657);
		PracticeCollections p1=new PracticeCollections("Aditi", "Jed", 29, 8477);
		PracticeCollections p2=new PracticeCollections("Komal", "Kuswaha", 26, 6789);
		
		LinkedList<PracticeCollections> list=new LinkedList<PracticeCollections>();
		list.add(p2);
		list.add(p1);list.add(p2);
		list.add(p);
		
		//so there are many methods of collection we can use also depending over our requirement
		for(PracticeCollections fitr: list)
		{
			System.out.println(fitr.firstName+" "+fitr.LastName+" "+fitr.uniqueId+" "+" "+fitr.Age);
		}
		
		ListIterator<PracticeCollections> itr=list.listIterator();
		while(itr.hasNext())
		{
			PracticeCollections pr=itr.next();
			System.out.println(pr.firstName+" "+pr.LastName+" "+pr.Age+" "+pr.uniqueId);
		}
		
	}
}
