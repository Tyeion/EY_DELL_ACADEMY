package practiceJava;

import java.util.Arrays;
import java.util.Comparator;

class human implements Comparable<human>{

	String Firstname,LastName;
	int Age;
	
	
	
	public human(String firstname, String lastName, int age) {
		super();
		Firstname = firstname;
		LastName = lastName;
		Age = age;
	}



	public String getFirstname() {
		return Firstname;
	}



	public void setFirstname(String firstname) {
		Firstname = firstname;
	}



	public String getLastName() {
		return LastName;
	}



	public void setLastName(String lastName) {
		LastName = lastName;
	}



	public int getAge() {
		return Age;
	}



	public void setAge(int age) {
		Age = age;
	}



	@Override
	public String toString() {
		return "human [Firstname=" + this.Firstname + ", LastName=" + this.LastName + ", Age=" + this.Age + "]";
	}

	@Override
	public int compareTo(human o) {
		
		return  this.Age - o.Age;
	}
	
	public static Comparator<human> ageComparator=new Comparator<human>() {
	public int compare(human o1,human o2)
	{
		return o1.getAge() - o2.getAge();
	}
	};
	
	public static Comparator<human> nameComparator=new Comparator<human>() {
		
		@Override
		public int compare(human o1, human o2) {
			// TODO Auto-generated method stub
			
			return o1.getFirstname().compareTo(o2.getFirstname());
		}
	};
	
	public static Comparator<human> lastNameComparator=new Comparator<human>() {
		
		@Override
		public int compare(human o1, human o2) {
			// TODO Auto-generated method stub
			return o1.getLastName().compareTo(o2.getLastName());
		}
	};



	


}

public class PracticeComparator {
public static void main(String[] args) {
	human[] h=new human[3];
	h[0] =new human("Pardeep","Kumar",21);
	h[1]=new human("Aditi","Kumari",28);
	h[2]=new human("Komal","Adele",25);
	
	  Arrays.sort(h);

      System.out.println("Sorted emp array is " + Arrays.toString(h));
      
      Arrays.sort(h,human.ageComparator);

      System.out.println("Sorted emp array age " + Arrays.toString(h));
      
      Arrays.sort(h,human.lastNameComparator);
    		 
      System.out.println("Sorted emp array is " + Arrays.toString(h));
}
}
