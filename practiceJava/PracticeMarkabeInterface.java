package practiceJava;

public class PracticeMarkabeInterface implements Cloneable {

	int personId;
	String personName;
	
	PracticeMarkabeInterface(int personId, String personName)
	{
		this.personId = personId;
		this.personName = personName;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		PracticeMarkabeInterface p =new PracticeMarkabeInterface(897,"Tyeion");
		PracticeMarkabeInterface p1=(PracticeMarkabeInterface) p.clone();
		
		System.out.println("The ID of the person is "+ p.personId + " and name is "+ p.personName);
		System.out.println("Cloning ID "+ p1.personId + " and name "+p1.personName);
		
		
		
	}
}
