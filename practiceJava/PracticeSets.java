package practiceJava;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class PracticeSets {
	public static void main(String[] args) {
		PracticeCollections p=new PracticeCollections("Pardeep", "Kumar", 21, 4657);
		PracticeCollections p1=new PracticeCollections("Aditi", "Jed", 29, 8477);
		PracticeCollections p2=new PracticeCollections("Komal", "Kuswaha", 26, 6789);
		
		LinkedHashSet<PracticeCollections> Hlist=new LinkedHashSet<PracticeCollections>();
		Hlist.add(p2);
		Hlist.add(p);
		Hlist.add(p1); Hlist.add(p);
		
		Iterator<PracticeCollections> itr=Hlist.iterator();
		while(itr.hasNext())
		{
			PracticeCollections pr=itr.next();
			System.out.println(pr.firstName+" "+pr.LastName+" "+pr.Age+" "+pr.uniqueId);
		}
	}
}
