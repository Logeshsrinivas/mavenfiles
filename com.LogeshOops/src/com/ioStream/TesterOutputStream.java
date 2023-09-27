package com.ioStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TesterOutputStream {

	public static void main(String[] args) {
	
		try(FileOutputStream fos = new FileOutputStream("OutputFile.txt");
				Scanner read = new Scanner(System.in);){
				String text = read.nextLine();
				byte[] b = text.getBytes();
				fos.write(b);
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
