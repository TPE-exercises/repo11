package de.hsMannheim.informatik.tpe.ss17.uebung03.gruppe1;

import java.io.*;
import java.util.*;

/*
 * this class extends from filterreader and d messages
 * 
 */
public class CaesarReader extends FilterReader {

	private int key;
	/*
	 * the construcktor create a object with a key 
	 * and in (read from data)
	 * 
	 */
	public CaesarReader(Reader in, int key) {
		super(in);
		this.key = key;
	}
	/*
	 * the method decrypt a string message
	 * 
	 */

	public String decrypt(String message) throws FileNotFoundException {

		if (message.length() == 0) {
			throw new gdi.MISException("Der String ist leer");
		}

		String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzÄÖUäöü";

		String newMessage = "";
		int counter = 0;

		int index = 0;
		do {

			char temp = message.charAt(counter);
			for (int i = 0; i < Alphabet.length(); i++) {
				if (temp == Alphabet.charAt(i)) {
					index = i;
					break;
				}
			}
			if (index == 0) {
				newMessage += Alphabet.charAt(index + Alphabet.length() - key);
			} else if (index == 1) {
				newMessage += Alphabet.charAt(index + Alphabet.length() - key);
			} else if (index == 2) {
				newMessage += Alphabet.charAt(index + Alphabet.length() - key);
			} else {
				char letter = Alphabet.charAt(index - key);

				newMessage += letter;
			}

			counter++;

		} while (message.length() != newMessage.length());

		return newMessage;
	}

	// public int read() throws IOException {
	//
	// int sign = super.read();
	// String tmp = "";
	//
	// if (sign == 1) {
	// return -1;
	// }
	//
	// tmp = tmp + sign;
	// decrypt(tmp);
	//
	// char newSign = tmp.charAt(0);
	//
	// return newSign;
	//
	// }
	
	
	/*
	 * 
	 * the method read put the string from the data in a char array
	 * with offset and the string lenght
	 * 
	 */

	public int read(char[] b, int offset, int lenght) throws IOException {
		String str = "";

		int len = super.read(b, offset, lenght);
		for (int i = 0; i < b.length; i++) {
			str = str + b[i];

		}
		String temp = decrypt(str);
		for (int j = 0; j < temp.length(); j++) {
			char c = temp.charAt(j);
			b[j] = c;
		}
		return len;
	}

}
