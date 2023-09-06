package practiceJava;

public class duration {

	long firstValue,lastValue;
	
	duration(int firstValue,int lastValue)
	{
		if(firstValue > lastValue)
		{
			throw new IllegalArgumentException("Error aagya!!") ;
		}
		this.firstValue=firstValue;
		this.lastValue=lastValue;
	}
	
	long value()
	{
		return lastValue - firstValue;
	}
	
	public static void main(String[] args) {
		
		duration obj= new duration(89,57);
		System.out.println("let me see "+obj.value());
	}
}
