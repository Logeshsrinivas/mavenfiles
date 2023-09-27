package com.ioStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesterBuffered {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
			
			String s = br.readLine().toUpperCase();
			int number = Integer.parseInt(br.readLine());
			String join = s+number;
			BufferedWriter bw = new BufferedWriter(new FileWriter("write.txt"));
			bw.append(join);
			br.close();
			bw.close();
		}catch (IOException e) {
			System.out.println(e.getMessage());
			

	}

	}
}
	
