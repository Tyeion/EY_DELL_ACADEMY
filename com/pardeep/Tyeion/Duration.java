package com.pardeep.Tyeion;

public class Duration {

	long StartValue, endValue;
	
	Duration (long StartValue,long endValue){
		if(StartValue > endValue)
		{
			throw new IllegalArgumentException("ERROR!!!");
		}
		this.StartValue = StartValue;
		this.endValue = endValue;
	}
	
	long duration()
	{
		return endValue- StartValue;
	}
	
	public static void main(String []aa)
	{
		Duration obj=new Duration(21,19);
		System.out.println("Duration"+ obj.duration());
		
	}
}
