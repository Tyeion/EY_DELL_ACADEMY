package practiceJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

//Typing input to the console and then reading with the help of BufferedReader and InpustStream.
public class PracticeCheckedExcpetion {

	
	public static void main(String[] args) {
		BufferedReader br=null;   
		Reader r= new InputStreamReader(System.in);
		
		br=new BufferedReader(r);
		String str;
		try {
			do {
				System.out.println("Now it will read!!");
				str=br.readLine();
				System.out.println("What I have Enter is now printed "+ str);
			}while(!str.equalsIgnoreCase("terminate"));
		}catch(IOException e)
		{
			e.printStackTrace();
		}finally {
			if(br!=null)
			{
				try {
					br.close();
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
	}
}
