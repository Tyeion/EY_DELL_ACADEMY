package practiceJava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class PracticeFileTimeStamp {
	public static void main(String[] args) throws IOException 
	{
		Path p=Paths.get("C:/files/ABC3.txt");
		
		BasicFileAttributeView view=Files.getFileAttributeView(p, BasicFileAttributeView.class);
		BasicFileAttributes sttr= view.readAttributes();
		
		FileTime certainTime = sttr.creationTime();
		System.out.println("Creation time of my file is "+certainTime);
		
		FileTime lastAccessedTime = sttr.lastAccessTime();
		System.out.println("Modified time of my file was "+ lastAccessedTime);

		FileTime modifiedTime = sttr.lastModifiedTime();
		System.out.println("Modified time of my file was "+ modifiedTime);
		
	}
}
