package com.stream;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TesterFileSystem {

	public static void main(String[] args) {
		Path p1= Paths.get("C:\\Users\\lsrinivasan\\eclipse-workspace\\...\\com.LogeshOops\\InputFile.txt");
		
		Path normalizedpath = p1.normalize();	
		System.out.println(normalizedpath);
		
		System.out.println(p1.getNameCount());
		System.out.println(""+p1.getFileName());
		System.out.println(""+p1.getFileSystem());
		System.out.println(""+p1.getName(3));
		System.out.println(""+p1.getParent());
		System.out.println(""+ p1.getRoot());
		System.out.println(""+ p1.isAbsolute());
		System.out.println(""+p1.toAbsolutePath());
		System.out.println(""+p1.toUri());
		System.out.println(""+p1.subpath(2, 5));
		}

}
