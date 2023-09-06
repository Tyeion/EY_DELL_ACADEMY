package com.pardeep.Tyeion25Aug;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerializedSingleTon implements Serializable{
	private static final long serialVersionID =1L;
	 private SerializedSingleTon(){ }
	 
	 private static class SingleTondHelper{
		 private static final SerializedSingleTon instance = new SerializedSingleTon();
	 }
	 
public static SerializedSingleTon getInstance() {
	return SingleTondHelper.instance;
}
protected Object readResolve() {
	return getInstance();
}
}
public class SerializableAndDeserializationUsingSingle {
  public static void main(String[] args) throws Exception {
	SerializedSingleTon instance1=SerializedSingleTon.getInstance();
	ObjectOutput out=new ObjectOutputStream(new FileOutputStream("C:/files/ABC3.txt"));
	out.writeObject(instance1);
	out.close();
	
	ObjectInput in=new ObjectInputStream(new FileInputStream("C:/files/ABC3.txt"));
	SerializedSingleTon instance2=(SerializedSingleTon)in.readObject();
	in.close();
	
	System.out.println("Instance1 Hashcode Value "+ instance1.hashCode());
	System.out.println("Instance2 HashCode Vaklue "+ instance2.hashCode());
}
 
}
