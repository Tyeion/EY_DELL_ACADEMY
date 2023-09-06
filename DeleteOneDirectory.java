package com.pardeep.Tyeion17Aug;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;


public class DeleteOneDirectory 
{
public static void main(String[] args) throws IOException
{
	Path p=Paths.get("C:/files/ABC8.txt");
//	Files.delete(p);
//	System.out.println("One directory got deleted ");
	//above code is used for deleting directory but there is some error in it
	
//	Path p2= Paths.get("C:/files/ABC");
	BasicFileAttributeView view=Files.getFileAttributeView(p, BasicFileAttributeView.class);
	BasicFileAttributes attr =view.readAttributes();
	
	FileTime certainTime = attr.creationTime();
	System.out.println("Creation time of my file is "+certainTime);
	
	FileTime lastAccessedTime = attr.lastAccessTime();
	System.out.println("Modified time of my file was "+ lastAccessedTime);

	FileTime modifiedTime = attr.lastModifiedTime();
	System.out.println("Modified time of my file was "+ modifiedTime);
}
}
