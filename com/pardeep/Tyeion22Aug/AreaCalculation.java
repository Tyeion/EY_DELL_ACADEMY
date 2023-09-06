package com.pardeep.Tyeion22Aug;

@FunctionalInterface
interface Circle2{
	double get(double radius);
}

public class AreaCalculation {
public static void main(String[] args) {
	Circle2 circleRadius = (r)-> Math.PI*r*r;
	Circle2 circleCircumfrence = (r)->2*Math.PI*r;
	
	AreaCalculation obj=new AreaCalculation() ;
	double area=obj.circleOperation(10 , circleRadius);
	double circumfrence = obj.circleOperation(20, circleCircumfrence);
	
	System.out.println("Area of Circle is "+area +" and circumfrence is "+circumfrence);
			
}
public double circleOperation(double radius, Circle2 c)
{
	return c.get(radius);
}

}
