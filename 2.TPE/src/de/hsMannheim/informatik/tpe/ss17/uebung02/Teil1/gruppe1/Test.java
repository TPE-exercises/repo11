package de.hsMannheim.informatik.tpe.ss17.uebung03.gruppe1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {

		String message = "hallo";

		CaesarWriter a = new CaesarWriter(new FileWriter("tpe3.txt"), 0);
		a.write(message, 0, message.length());
		a.close();
		String s=a.encrypt(message);
		

		CaesarReader b = new CaesarReader(new FileReader("tpe3.txt"), 0);
		char[] cbuf = new char[message.length()];
		b.read(cbuf, 0, message.length());
		b.close();

		String decrypt = new String(cbuf,0,message.length());
		System.out.println(s);
		System.out.println(decrypt);
		
//		int x = -1;
//		int m = ((x % 8) + 8) % 8;
//		System.out.println(m);
      
	}
  
}
