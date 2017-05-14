package de.hsMannheim.informatik.tpe.ss17.uebung03.gruppe1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {

		String message = "ABDEöäüÖÄÜ";

		CaesarWriter a = new CaesarWriter(new FileWriter("text.txt"),3);
		a.write(message, 0, message.length());
		a.close();

		CaesarReader b = new CaesarReader(new FileReader("text.txt"), 3);
		char[] cbuf = new char[message.length()];
		b.read(cbuf,0,message.length());
		b.close();

		String decrypt = new String(cbuf);
		System.out.println(decrypt);

	}

}
