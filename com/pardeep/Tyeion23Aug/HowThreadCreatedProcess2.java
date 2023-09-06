package com.pardeep.Tyeion23Aug;

public class HowThreadCreatedProcess2 implements Runnable{
public static void main(String[] args) {
	HowThreadCreatedProcess2 obj=new HowThreadCreatedProcess2();
	Thread t1=new Thread(obj);
	t1.start();
}

@Override
public void run()
{
	System.out.println("I am also got called automatically");
}
}
