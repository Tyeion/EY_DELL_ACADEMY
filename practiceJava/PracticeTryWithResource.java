package practiceJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PracticeTryWithResource {
	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new FileReader("C:/files/ABC3.txt"));
			String str;
			while((str=br.readLine())!=null)
			{
				System.out.println(str);
			}
			br.close();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
		try(BufferedReader br=new BufferedReader(new FileReader("C:/files/ABC8.txt")))
		{
			String str;
			while((str=br.readLine())!=null)
			{
				System.out.println(str);
			}
			br.close();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
