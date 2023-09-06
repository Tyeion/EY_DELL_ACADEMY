package practiceJava;
import java.util.*;

public class stringsPractice {

	public static void main(String [] args)
	{
		String str= new String("PARDEEP");
		System.out.println("1 --: "+ str);
		
		str.concat("KUMAR"); // concat funciton is used to join together two strings.
		
		System.out.println("2--: "+ str);
		
		str.replace('P', 'J'); // replace the exisisting character wit new character.
	   System.out.println("3--" + str);
	   
	   System.out.println("So this string class will show the immutability nature of string which means no changeability");
	
	   /*String buffer and String builder are same they are mutable in nature which
	    means they can change but the main key difference is stringBuffer is thread safe
	    whereas stringBuilder is not thread safe.
	    */
	   //mutability nature
	   StringBuffer bstr= new StringBuffer("ORIGINAL");
	   bstr.append(" ,ADDED");
	   System.out.println("4-- :"+ bstr.toString());
	   bstr.replace(0,3,"PAL");
	   System.out.println("5-- "+bstr.toString());
	  
	  System.out.println("6-- "+bstr.subSequence(2, 8));
	
	
	
	}
}
