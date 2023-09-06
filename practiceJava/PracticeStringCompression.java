package practiceJava;

public class PracticeStringCompression {
public static void main(String[] args) {
	String str="aapardeep";
	String compressed = StringComp(str);
    System.out.println("Compressed String: " + compressed);
}

public static String StringComp(String str)
{
	StringBuilder newStr=new StringBuilder();
	int count=1;
	int lengthOfString=str.length();
	
	for(int i=0;i<lengthOfString-1; i++)
	{
		
		if(str.charAt(i)==str.charAt(i+1))
		{
			count++;
		}else {
			newStr.append(str.charAt(i));
			newStr.append(count);
			count=1;
		}
	}	
		newStr.append(str.charAt(str.length()-1));
		newStr.append(count);
		
		
	
	return newStr.toString();
}
}
