package practiceJava;

abstract class Shape{
	int l,b,h,area ;
	abstract void draw();
	
	void show()
	{
		System.out.println("Calculate the area of the shape");
	}
}

class Rectangle extends Shape{
	@Override
	void draw()
	{
		int l=9,b=8;
		area=l*b;
		System.out.println("The area of rectangle is "+ area);
	}
	
}

class Triangle extends Shape{
	@Override
	void draw()
	{
		int l=9,h=7;
		area=(l*h)/2;
		System.out.println("The area of triangle is "+ area);
	}
	
}

public class PracticeAbstraction {

	public static void main(String[] args) {
		PracticeAbstraction pb=new PracticeAbstraction();
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		
		r.show();
		r.draw();
	     t.show();
	     t.draw();
	}
}
