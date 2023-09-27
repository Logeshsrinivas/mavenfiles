package com.serializationDeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesterSportsman {

	public static void main(String[] args)  {
		SportsMan sm = new SportsMan("MSDhoni","CricketTeam","TeamCAptain","Male",1,9.2f);

		try(FileOutputStream fw = new FileOutputStream("ObjectWrite.ser");
				ObjectOutputStream ois = new ObjectOutputStream(fw);) {
			ois.writeObject(sm);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		SportsMan sm1=null;

		try(FileInputStream fis = new FileInputStream("ObjectWrite.ser");
				ObjectInputStream oos = new ObjectInputStream(fis);){
			sm1=(SportsMan)oos.readObject();
			System.out.println(sm1);

		}catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
