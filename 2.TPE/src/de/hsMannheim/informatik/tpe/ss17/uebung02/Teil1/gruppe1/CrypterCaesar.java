package de.hsMannheim.informatik.tpe.ss17.uebung02.Teil2.gruppe1;

public class CrypterCaesar implements Crypter {

	@Override
	public String encrypt(String message) {

		String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		String var = message.toUpperCase();

		String newMessage = "";
		int counter = 0;
		int key = 3;
		int index = 0;

		do {

			char temp = var.charAt(counter);
			for (int i = 0; i < Alphabet.length(); i++) {
				if (temp == Alphabet.charAt(i)) {
					index = i;
				}
			}
			if (index == 23) {
				newMessage += Alphabet.charAt(index - Alphabet.length() + key);
			} else if (index == 24) {
				newMessage += Alphabet.charAt(index - Alphabet.length() + key);
			} else if (index == 25) {
				newMessage += Alphabet.charAt(index - Alphabet.length() + key);
			} else {
				char letter = Alphabet.charAt(index + key);

				newMessage += letter;
			}

			counter++;

		} while (message.length() != newMessage.length());

		return newMessage;
	}

	@Override
	public String decrypt(String cypherText) {
		String Alphabet = "abcdefghijklmnopqrstuvwxyz";

		String var = cypherText.toLowerCase();

		String newMessage = "";
		int counter = 0;
		int key = 5;
		int index = 0;
		do {

			char temp = var.charAt(counter);
			for (int i = 0; i < Alphabet.length(); i++) {
				if (temp == Alphabet.charAt(i)) {
					index = i;
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

		} while (cypherText.length() != newMessage.length());

		return newMessage;
	}

}
