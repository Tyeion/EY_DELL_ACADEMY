package com.pardeep.Tyeion21Aug;

import java.util.Stack;

public class StackClass {
		public static void main(String[] args) {
			Stack<Integer> st=new Stack<>();
			showPush(st,54);showPush(st,78);showPush(st,89);
			st.push(234);
			System.out.println(st);
			showPop(st);showPop(st);
			
		}
		
		static void showPush(Stack<Integer> st, int a)
		{
			st.push(new Integer(a));
			System.out.println(st); 
		}
		
		static void showPop(Stack<Integer> st)
		{
			st.pop();
			System.out.println(st);
		}
}
