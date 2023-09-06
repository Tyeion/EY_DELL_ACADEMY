package practiceJava;

public class PracticeCollections implements Comparable<PracticeCollections> {
	String firstName,LastName;
	int Age;
	int uniqueId;
	 PracticeCollections(String firstName, String lastName, int age, int uniqueId) {
		this.firstName = firstName;
		LastName = lastName;
		Age = age;
		this.uniqueId = uniqueId;
	}
	@Override
	public int compareTo(PracticeCollections o) {
		// TODO Auto-generated method stub
		if(Age > o.Age)
		{
			return 1;
		}else if(Age < o.Age)
		{
			return -1;
		}
		else {
		return 0;
		}
	}
	
	
}
