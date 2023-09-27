package com.ioStream;
import java.io.FileInputStream;
import java.io.IOException;
public class TesterStreamIO {

	public static void main(String[] args) throws IOException{
		FileInputStream fis = null;
		try
		{
			 fis = new FileInputStream("InputFile.txt");
			int data = fis.read();
			while(data!=-1) {
				System.out.print((char)(data));
				data=fis.read();			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			fis.close();
		}
	}

}
