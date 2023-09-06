package practiceJava;

public class practiceConstructors {

	int a,b;
	practiceConstructors()
	{
		System.out.println("You have accesed the default constructor");
		int number=10;
	}
	
	
	practiceConstructors(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("You are accesing now parameterized constructors");
	}
	
	public static void main(String[] args) {
		
		practiceConstructors obj= new practiceConstructors();
		practiceConstructors obj1=new practiceConstructors(78,65);
		System.out.println("default Constructos "+ obj1.a + " "+obj1.b);
	}
}
