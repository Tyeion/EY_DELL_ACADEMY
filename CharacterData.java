package com.pardeep.Tyeion17Aug;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterData {

	public static void main(String[] args) {
		try{
			File f=new File("C:/files/ABC3.txt");
		System.out.println(f.exists());
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		
		BufferedWriter bw2=new BufferedWriter(new FileWriter(new File("C:/files/ABC3.txt")));
		bw.write("ABCD");
		bw.newLine();
		bw.write("We are writing character data using BufferedWriter");
		bw.newLine();
		bw.flush();
		bw.close();
		
		BufferedReader br=new BufferedReader(new FileReader(new File("C:/files/ABC3.txt")));
		String str;
		
		while((str = br.readLine())!=null) {
			System.out.println(str);
		}
		
		br.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
