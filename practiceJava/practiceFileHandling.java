package practiceJava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class practiceFileHandling {

	
	public static void main(String[] args) {
		try {
		File f=new File("C:/files/abc3.txt");
		System.out.println(f.exists());
		
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		
		BufferedWriter bw2=new BufferedWriter(new FileWriter(new File("C:/files/abc3.txt")));
		bw.write("SOMETHING");
		bw.newLine();
		bw.write("mere dholna sun");
		bw.flush();
		bw.close();
		
		BufferedReader br=new BufferedReader(new FileReader(new File("C:/files/abc3.txt")));
		String str;
		
		while((str = br.readLine())!=null)
		{
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
