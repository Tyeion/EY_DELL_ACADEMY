package com.pardeep.Tyeion17Aug;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceConcept {
	
	public static void main(String[] args) {
		
	
	
	try {
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\BA924ZQ\\OneDrive - EY\\Desktop\\ABC.txt"));
		String str;
		while((str = br.readLine()) !=null)
		{
			System.out.println(str);
		}
		br.close();
	}catch(IOException e)
	{
		System.out.println(e.getMessage());
	}
	
	try(BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\BA924ZQ\\OneDrive - EY\\Desktop\\ABC.txt")))
	{
		String str;
		while((str = br.readLine()) !=null)
		{
			System.out.println(str);
		}
		br.close();
	}catch(IOException e)
	{
		System.out.println(e.getMessage());
	}	
	
}
}