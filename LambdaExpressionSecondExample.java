package com.pardeep.Tyeion22Aug;

interface isFunctional{
	void show(String data);
}

public class LambdaExpressionSecondExample {
public static void main(String[] args) {
	isFunctional obj= new isFunctional() {
		
		@Override
		public void show(String data) {
			// TODO Auto-generated method stub
			System.out.println("Using anonymous inner"+data);
		}
	};
	
	obj.show("Class way of Implementaion");
	
	isFunctional obj2= (demoData) -> {
		System.out.println("Eliminating Anonymous Inner "+ demoData);
	};
	
	obj2.show("Class way of implementation - Through Lambda Expression");
}
}
