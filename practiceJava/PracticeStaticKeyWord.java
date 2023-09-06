package practiceJava;

public class PracticeStaticKeyWord {

	int first;  //non static variable 
	static int second;  //static variable
	
	PracticeStaticKeyWord()
	{
		first++;
		second++;
		System.out.println("Non Static data member "+first +" Static data member "+second);
	}
	
	void obj() {
	
	}
	
	public static void main(String[] args) {
		PracticeStaticKeyWord p=new PracticeStaticKeyWord();
		PracticeStaticKeyWord p1=new PracticeStaticKeyWord();
		PracticeStaticKeyWord p2=new PracticeStaticKeyWord();
	}
}
