package practiceJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	
	private static final long serialVersionUID = 1L;
	/*s It is used to provide version control when serializing and deserializing objects in Java.
	 *  It's an optional field that you can add to your serializable 
	 * class to manage compatibility between serialized objects across different versions of your code.*/
	private String name;
	private int Age ;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		Age = age;
	}
	
}

public class PracticeSerialization {
  public static void main(String[] args) {
	Person p=new Person("Pardeep", 21);
	//serializaiton
	try {
		FileOutputStream fos=new FileOutputStream("p.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(p);
		oos.close();
		fos.close();
		System.out.println("Object has been serialized");
	}catch(IOException e)
	{
		e.printStackTrace();
	}
	
	//deserialization
	try {
		FileInputStream fis=new FileInputStream("p.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Person deserializedobject=(Person)ois.readObject();
		//whenever we deserialize type conversion is important otherwise it will give classcast exception at runtime
	   ois.close();
	   fis.close();
	   System.out.println("Object has been deserialized");
	   System.out.println("Name "+ deserializedobject.getName());
	   System.out.println("Age "+ deserializedobject.getAge());
	}catch(IOException | ClassNotFoundException e)
	{
		e.printStackTrace();
	}
}
	
	
}
