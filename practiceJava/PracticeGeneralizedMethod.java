package practiceJava;

public class PracticeGeneralizedMethod {
public static void main(String[] args) {
	Integer [] intArr= {67,7,4,32,45,67,90,0};
	String [] strArr= {"Z","N","M","D"};
	
	printArray(intArr);
	printArray(strArr);
}

static <E> void printArray(E[] e)
{
	for(E pr:e)
	{
		System.out.print(pr+" ");
	}
	System.out.println();
}
}
