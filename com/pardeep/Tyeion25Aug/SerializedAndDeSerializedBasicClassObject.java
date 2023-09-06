package com.pardeep.Tyeion25Aug;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	int empId;
	String empName;
	Employee(int empId,String EmpName){
		this.empId=empId;
		this.empName=empName;
	}
}

public class SerializedAndDeSerializedBasicClassObject {
		public static void main(String[] args) throws IOException, ClassNotFoundException {
			Employee emp=new Employee(123, "ABC");
			FileOutputStream fos=new FileOutputStream("abcd.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(emp);
			
			FileInputStream fis=new FileInputStream("abcd.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Employee emp2=(Employee) ois.readObject();
			
			System.out.println(emp2.empId + " "+ emp2.empName);
			oos.close();
			ois.close();
		}
}
