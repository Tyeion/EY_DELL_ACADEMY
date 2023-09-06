package practiceJava;

class MyGenericClass<T>{
	T obj;
	
	void add(T obj)
	{
		this.obj=obj;
	}
	
	T get()
	{
		return obj;
	}
}

public class PracticeGenerics {
 public static void main(String[] args) {
	MyGenericClass<Integer> intType=new MyGenericClass<>();
			intType.add(67890);
	
	MyGenericClass<String> strType=new MyGenericClass<>();
	  strType.add("vhjk");
	  
	  System.out.println(intType.get());
	  System.out.println(strType.get());
	
}
}
