package com.ioStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TesterReadCharacterStream {

	public static void main(String[] args) {
		char[] ch = new char[128];
		try(FileReader fr =new FileReader("readInput.txt");){
			int c = fr.read(ch);
			System.out.println(ch);
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		try (FileWriter fw = new FileWriter("write.txt");){
			char [] cbuf = "Hi praveen what's Up ! , Man.... Ho its going".toCharArray();
			fw.write(cbuf);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try(FileReader fr1 =new FileReader("readInput.txt");
			FileWriter fw2 = new FileWriter("writeOutput.txt");){
			fr1.read(ch);
			fw2.write(ch);			
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
