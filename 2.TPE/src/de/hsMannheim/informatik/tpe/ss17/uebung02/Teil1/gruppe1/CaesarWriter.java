package de.hsMannheim.informatik.tpe.ss17.uebung03.gruppe1;

import java.io.*;

import gdi.MakeItSimple.GDIException;
/*
 * the class extends from filterwriter and encrypt a string messages
 */
public class CaesarWriter extends FilterWriter {

	private int key;
	/*
	 * the construcktor create a object with a key
	 * and out (date)
	 * 
	 */
	public CaesarWriter(Writer out, int key) {
		super(out);
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

		

		String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzƒ÷‹‰ˆ¸";

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
			
				if(index+key>=Alphabet.length()){
					
					newMessage += Alphabet.charAt(index - Alphabet.length() + key);
				}else{
				char letter = Alphabet.charAt(index + key);
				
				newMessage += letter;
				}
			

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

	
}
