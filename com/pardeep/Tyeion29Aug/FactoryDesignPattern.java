package com.pardeep.Tyeion29Aug;

interface Shape{
	public void draw();
}

class Rectangle implements Shape{
	@Override
	public void draw()
	{
		System.out.println("Rectangle class draw function");
	}
	
}

class Circle implements Shape{
	@Override
	public void draw()
	{
		System.out.println("Circle class draw function");
	}
	
}

class Square implements Shape{
	@Override
	public void draw()
	{
		System.out.println("Square class draw function");
	}
	
}

class ShapeFactory{
	public Shape getShape(String shapeType)
	{
		if(shapeType==null) {
			return null;
		} if(shapeType.equalsIgnoreCase("Circle"))
		{
			return new Circle();
		}if(shapeType.equalsIgnoreCase("Rectangle"))
		{
			return new Rectangle();
		}if(shapeType.equalsIgnoreCase("Square"))
		{
			return new Square();
		}
		return null;
	}
}


public class FactoryDesignPattern {
public static void main(String[] args) {
	try {
	ShapeFactory shapefactory=new ShapeFactory();
	Shape shape1=shapefactory.getShape("Circle");
	shape1.draw();
	
	Shape shape2 =shapefactory.getShape("Rectangle");
	shape2.draw();
	
	Shape shape3=shapefactory.getShape("Sqare");
	shape3.draw();
	}catch(NullPointerException e)
	{
//		e.printStackTrace();
		System.out.println("😒😒😒😒😒"+"System dhae gaya"+"🤢🤢🤢😢😢😢");
	}
}

}
