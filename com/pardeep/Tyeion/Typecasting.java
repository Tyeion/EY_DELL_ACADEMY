package com.pardeep.Tyeion;


class Machine{
	void start()
	{
		System.out.println("Machine Started");
	}
	
	void stop()
	{
		System.out.println("MAchine Stopped");
	}
}

class Camera extends Machine{
	
//	Camera()
//	{
//		System.out.println("Construttor");
//	}
	@Override
	void start()
	{
		System.out.println("Camera has Started");
	}
	
//	void stop()
//	{
//		System.out.println("Camera has stopped");
//	}
	
	void snap()
	{
		System.out.println("");
	}
	
}

public class Typecasting {

	public static void main(String[] args) {
		Machine m=new Machine();
		m.start(); //Machine started
		m.stop();   //Machine Stop
		
		Camera c= new Camera();
		c.start();
		c.stop();
		
		//referring to parent class and object of child class
		Machine pc=new Camera();	
		pc.start();
		pc.stop();
		
		//referring to child and creating a parent class object is an error means vice verca to opposite example 
		 
	
	}
}
