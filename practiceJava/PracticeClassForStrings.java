package practiceJava;

public class PracticeClassForStrings {
public static void main(String[] args) {
	String str="pardeep";
//	reverse(str.toCharArray());
	String Nstr=Remove(str, 'p');
	System.out.println(Nstr);
	
}

public static void reverse(char[] str)
{
	int n=str.length;
	for(int i=n-1;i>=0;i--)
	{
		System.out.print(str[i]);
	}
	
}

public static String Remove(String str,char letter) {
	int n=str.length();
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<n;i++)
	{
	 char curr=str.charAt(i);
	  if(curr!=letter)
	  {
	    sb.append(curr);	  
	  }
	}
	
	return sb.toString();
}


}
