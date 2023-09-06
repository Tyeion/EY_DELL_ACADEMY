package com.pardeep.Tyeion;

public class LoopConstruct {
 public static void main(String []aa)
 {
	 int i= 1;
	 while(i<=10){
	 System.out.print(" "+i);
		 i++;
	 }
	 
	 
	 
	 
	 for(int j=0; j<10;j++)
	 {
		 System.out.print(j + " ");
	 }
	
	 System.out.println();
	 int n=11;
	 
	 do {
		 System.out.println(n+" ");
	 } while( n<=10);
	 
	 //ADVANCE FOR LOOP
	int  [] arr= {62,8,44,38,7,5};
	for(int x: arr)
	{
		System.out.print(x);
	}
 }
}
