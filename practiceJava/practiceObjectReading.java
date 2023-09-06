package practiceJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class practiceObjectReading {
		public static void main(String[] args) {
			String str=new String("This file will read object");
			Integer i=new Integer(645);
			
			try {
				FileOutputStream fom=new FileOutputStream("C:/files/abc5.txt");
				ObjectOutputStream oos=new ObjectOutputStream(fom);
				ObjectOutputStream oos2=new ObjectOutputStream(new FileOutputStream("C:/files/abc5.txt"));
				
				oos.writeObject(str);
				oos.writeObject(i);
				
				oos.close();
				
				ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:/files/abc5.txt"));
				System.out.println("String Data is "+ (String) ois.readObject());
				System.out.println("Integer Data is "+ (Integer) ois.readObject());
				
				ois.close();
			}catch(IOException e)
			{
				e.printStackTrace();
			}catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			
		}
}
