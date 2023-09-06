package practiceJava;

public class PracticePalindrome {
  public static void main(String[] args) {
	String str="rdfacecar";
	System.out.println(Pali(str.toCharArray()));
}
  
  public static boolean Pali(char[] str)
  {
	  int n=str.length;
	  for(int i=0;i<n/2;i++)
	  {
		  if(str[i]!=str[n-1-i])
		  {
			  return false;
		  }
	  }
	  
	  return true;
  }
}
