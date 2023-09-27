package com.ioStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TesterIOCharacterStream {

	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("InputFile.txt");
				FileOutputStream fos = new FileOutputStream("OutputFile.txt",true);){
			int d = fis.read()
;
			while(d!=-1) {
				fos.write(d);
				d =fis.read();			}
				} catch (IOException e) {
					System.out.println(e.getMessage());
			}
			
		}

	}


