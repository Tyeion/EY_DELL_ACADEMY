package com.pardeep.Tyeion17Aug;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

//Important code*****************
public class CheckedException {

	public static void main(String[] args) {
		BufferedReader br=null;
		Reader r=new InputStreamReader(System.in);
		
		br=new BufferedReader(r);
		String str;
		try {
			do {
			System.out.println("Please enter something, i will read it for you ");
			str=br.readLine();
			System.out.println("What you have entered is "+ str);
		}while(!str.equalsIgnoreCase("exit"));
		} catch(IOException e)
		{
			e.printStackTrace();
		}finally {
			if(br!=null)
			{
				try {
					br.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
