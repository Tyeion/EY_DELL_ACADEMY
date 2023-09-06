package com.pardeep.Tyeion;

import java.util.Arrays;

public class CopyArray {

	public static void main(String [] args)
	{
	char [] chArr1 = {'a','d','c','w','h'};
	char[]  chArr2 = new char[8];
	
	System.arraycopy(chArr1, 0, chArr2, 1, 3);
	System.out.println(Arrays.toString(chArr2));
	System.out.println(new String(chArr2));
	
	}


}
