package com.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CreateDirectory {

	public static void main(String[] args) {
//	try {
		Path p1= Paths.get("C:\\Users\\lsrinivasan\\eclipse-workspace\\com.LogeshOops\\Sample\\source.txt");
		Path p2= Paths.get("C:\\Users\\lsrinivasan\\eclipse-workspace\\com.LogeshOops\\Sample\\text3.txt");
//		if(!Files.exists(p1)) {
//				Files.createFile(p1);
//				System.out.println("File created");
//			}else {
//				System.out.println("File already exists");
//			}
//			
//		}catch (IOException e) {
//			System.out.println(e);		}
//		try {
//			Files.deleteIfExists(p1);
//			System.out.println("Directory deleted");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
		 
//		}
//		boolean result = Files.isReadable(p1);
//		System.out.println(result);
//		boolean result1 = Files.isWritable(p1);
//		System.out.println(result1);
		try {
			Files.move(p2, p1);
			System.out.println("Moved");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			float name ;
			System.out.println();
	}
	
	

}
