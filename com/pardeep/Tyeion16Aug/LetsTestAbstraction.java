package com.pardeep.Tyeion16Aug;

import java.util.*;


abstract class Shape {
	abstract void draw();
	
	int length,area,breadth,height,radius;
	double areaOfCircle;
	
	void purpose()
	{
		System.out.println("Calculate the area of the shapes");
	}
	
	
}

class Triangle extends Shape{
	@Override
	void draw()
	{
		int breadth=20,height=30;
		area=(breadth*height)/2;;
		System.out.println("Area of trianlge is "+ area);
	}
}

class Rectangle extends Shape{
	@Override
	void draw()
	{
		int breadth=20,height = 30;
		area=breadth* height;
		System.out.println("Area of the rectangle is "+ area);
	}
}

class Circle extends Shape{
	@Override
	void draw()
	{
		int radius=7;
		area=(int)(Math.PI)*radius*radius;
		System.out.println("Area of the circle is"+ area);
	}
}

public class LetsTestAbstraction{
	public static void main(String[] args) {
	   Triangle tr=new Triangle();
	   tr.draw();
       Rectangle r=new Rectangle();
       r.draw();
       Circle c=new Circle();
       c.draw();
       
	}
}
