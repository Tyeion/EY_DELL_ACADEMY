package com.pardeep.Tyeion23Aug;

public class HowJoinMethodsWorks extends Thread {

	public static void main(String[] args) {
		HowJoinMethodsWorks t1=new HowJoinMethodsWorks();
		HowJoinMethodsWorks t2=new HowJoinMethodsWorks();
		HowJoinMethodsWorks t3=new HowJoinMethodsWorks();
		
		t1.start();
		try {
			t1.join();
			}catch(InterruptedException e)
		{
				e.printStackTrace();
		}
		
		t2.start();
		t3.start();
	}
	
	public void  run()
	{
		for(int  i=0;i<5;i++)
		{
			try {
			Thread.sleep(1000);
			System.out.println("Running thread name is "+ Thread.currentThread().getName());
			}catch(InterruptedException e)
	   {
			e.printStackTrace();
		}
		System.out.println(i);
	}
		}
}
 