package practiceJava;

public class practiceInterface implements Icricketbook,IBook{

	@Override
	public void authorName() {
		// TODO Auto-generated method stub
		System.out.println("Sachin Tendulkar");
		
	}

	@Override
	public void priceOfBook() {
		// TODO Auto-generated method stub
		System.out.println("100$");
	}

	@Override
	public void Regions() {
		// TODO Auto-generated method stub
		System.out.println("ASIA");
	}
	
	public static void main(String[] args) {
		practiceInterface p=new practiceInterface();
		p.authorName();
		p.Regions();
		p.priceOfBook();
	}

}
