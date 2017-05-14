package de.hsMannheim.informatik.tpe.ss17.uebung03.gruppe1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CaesarFileEncryptor {

	public static void main(String[] args) throws IOException {
		CaesarFileEncryptor obj = new CaesarFileEncryptor();

		String filename = "";
//		obj.encrypt(new File(info));
		System.out.println(obj.getPath("C:/Users/Acer/Desktop"));
	
				

	}
	public File encrypt(File sourceDirectory) throws IOException {
		
		String path = "";
		String message= "";
		path = path+ sourceDirectory.getAbsolutePath();
		File o =new File(path);
		Scanner sc = new Scanner(o);
		while(sc.hasNextLine()){
			message = message+sc.nextLine();
		}
		System.out.println(message);
		CaesarWriter a = new CaesarWriter(new FileWriter(path), 3);
		a.write(message,0,message.length());
		a.close();
		return null;
	}
	String getPath(String filename){
		File o = new File(filename);
		String info="";
		info = info + o.getAbsoluteFile();;
		
		return info;
	}

//	@Override
//	public File decrypt(File sourceDirectory) throws IOException{
//	
//		return null;
//	}

}
