package de.hsMannheim.informatik.tpe.ss17.uebung03.gruppe1;

import java.io.*;

import gdi.MakeItSimple.GDIException;

/*
 * the class extends from filterwriter and encrypt a string messages
 */

public class CaesarWriter extends FilterWriter {
	
	String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzÄÖÜäöü";

	private int key;

	/*
	 * the construcktor create a object with a key and out (date)
	 * 
	 */
	public CaesarWriter(Writer out, int key) {
		super(out);
		if (key < 0) {
			key = Alphabet.length()+(key%Alphabet.length());
		}
		this.key = key;

	}

	/*
	 * encrypt the message
	 * 
	 */
	public String encrypt(String message) throws IOException {
		
		
		

		if (message.length() == 0) {
			throw new gdi.MISException("Der String ist leer");
		}

		

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

			
			
			
			int newIndex = ((index + key) % Alphabet.length());

			char letter = Alphabet.charAt(newIndex);

			newMessage += letter;

			counter++;

		} while (message.length() != newMessage.length());

		return newMessage;
	}

	/*
	 * write the message with offset and message length in the data
	 * 
	 */
	public void write(String message, int offset, int lenght) throws IOException {

		super.write(encrypt(message), offset, lenght);
	}
	public void write(String m) throws IOException{
		
		FileWriter o = new FileWriter("tpe3.txt");
		String s=encrypt(m);
		
		o.write(encrypt(s));
		o.close();
	}

}
