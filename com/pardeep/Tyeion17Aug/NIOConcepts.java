package com.pardeep.Tyeion17Aug;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOConcepts {
			public static void main(String[] args) throws IOException {
				
				
				Path p= Paths.get("C:/files/ABC3.txt");
				System.out.println(p.getFileName());
				System.out.println(p.getFileSystem());
				System.out.println(p.getParent());
				System.out.println(p.getRoot());
				
				File f=p.toFile();
				System.out.println(f.getAbsolutePath());
				
				BufferedReader br=Files.newBufferedReader(p , StandardCharsets.UTF_8);
				String str= null;
				while((str= br.readLine())!=null) {
					System.out.println(str);
				}
				
				//new code
				Files.createFile(Paths.get("C:/files/ABC78.txt"));
				System.out.println("File created");
				
				Files.createDirectories(Paths.get("C:/files/new_file"));
				System.out.println("Directory Created");
				
				Files.createDirectories(Paths.get("C:/files/new_file/new_file2"));
				System.out.println("Directories Created");
			}
}
