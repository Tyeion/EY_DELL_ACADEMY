package practiceJava;

interface xyz{}

class Parents implements xyz{}
class Child1 extends Parents{}
class Child2 extends Parents{}

public class PracticeInstanceof {

	public static void main(String[] args) {
		Parents p=new Parents();
		Child1 c1=new Child1();
		Child2 c2=new Child2();
		
		System.out.println(p instanceof Parents); //true
		System.out.println(c1 instanceof Child1); //true
		System.out.println(c2 instanceof Child2); //true
		
		System.out.println(c1 instanceof Parents); //true
		System.out.println(c2 instanceof Parents); //true
		
		Parents p1=new Child1();
		System.out.println(p1 instanceof Parents); //true 
		System.out.println(p1 instanceof Child1); //true
	}
}
