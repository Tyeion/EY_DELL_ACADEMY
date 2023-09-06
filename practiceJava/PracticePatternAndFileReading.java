package practiceJava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticePatternAndFileReading {
	public static void main(String[] args) {
	String searchString="Tyeion";
	String replaceString="Pardeep";
	
	try {
		BufferedReader br=new BufferedReader(new FileReader("C:\\files\\PatternFile.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\files\\output.txt"));
		
		String line;
		Pattern pattern=Pattern.compile(searchString);
		Matcher matcher;
		while((line=br.readLine())!=null)
		{
			matcher = pattern.matcher(line);
		 String replacedLine=matcher.replaceAll(replaceString);
		 bw.write(replacedLine);
		 bw.newLine();
		}
		
		bw.flush();
		bw.close();
		System.out.println("Replacement complete , check the file ");
	}catch(IOException e)
	{
		e.printStackTrace();
	}
	
}
}
