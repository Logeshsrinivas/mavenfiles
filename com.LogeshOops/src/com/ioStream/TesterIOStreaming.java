package com.ioStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class TesterIOStreaming {

	public static void main(String[] args) {
	try(BufferedReader br = new BufferedReader(new FileReader("readInput.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("writeIo.txt"))) {
		String s = br.readLine();
		bw.write(s);
	} catch (Exception e) {
		// TODO: handle exception
	}

	}

}
