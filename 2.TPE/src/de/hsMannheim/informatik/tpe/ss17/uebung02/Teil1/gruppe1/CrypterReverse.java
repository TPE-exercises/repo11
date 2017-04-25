package de.hsMannheim.informatik.tpe.ss17.uebung02.Teil2.gruppe1;

public class CrypterReverse implements Crypter {

	@Override
	public String encrypt(String message) {
		String newMessage = "";

		for (int x = message.length() - 1; x >= 0; x--) {

			newMessage = newMessage + message.charAt(x);
		}

		return newMessage;
	}

	@Override
	public String decrypt(String cypherText) {
		String newMessage = "";
		for (int x = cypherText.length() - 1; x >= 0; x--) {

			newMessage = newMessage + cypherText.charAt(x);
		}

		return newMessage;
	}

	public static void main(String[] args) {
		CrypterReverse my = new CrypterReverse();

		System.out.println(my.encrypt("HALLO"));

		System.out.println(my.decrypt(my.encrypt("HAllo")));
	}

}
