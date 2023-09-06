package com.pardeep.Tyeion17Aug;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectData {
	public static void main(String[] args) {
		String str= new String("String is immutable class");
		Integer i =new Integer(12345);
		
		try {
			FileOutputStream fom=new FileOutputStream("C:/files/ABC5.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fom);
			ObjectOutputStream oos2=new ObjectOutputStream(new FileOutputStream("C:/files/ABC5.txt"));
			
			oos.writeObject(str);
			oos.writeObject(i);
			
			oos.close();
			
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:/files/ABC5.txt"));
			System.out.println("String Data is "+(String) ois.readObject());
			System.out.println("Integer Data is "+(Integer) ois.readObject());
			
			ois.close();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}
}
