package practiceJava;

import java.util.Iterator;
import java.util.TreeSet;

public class PracticeTreeSet {
  public static void main(String[] args) {
	
	  PracticeCollections p=new PracticeCollections("Pardeep", "Kumar", 21, 4657);
		PracticeCollections p1=new PracticeCollections("Aditi", "Jed", 29, 8477);
		PracticeCollections p2=new PracticeCollections("Komal", "Kuswaha", 26, 6789);
		
		TreeSet<PracticeCollections> t=new TreeSet<PracticeCollections>();
		t.add(p2);
		t.add(p1);
		t.add(p);
		t.add(p);
		
		Iterator<PracticeCollections> itr=t.iterator();
		while(itr.hasNext())
		{
			PracticeCollections pr=itr.next();
			System.out.println(pr.firstName+" "+pr.LastName+" "+pr.Age+" "+pr.uniqueId);
		}
}
}
