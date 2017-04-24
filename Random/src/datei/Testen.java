package datei;

import static gdi.MakeItSimple.*;

public class Testen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
		int i = 42, j;

		String s = "Hello", t;

		boolean p = true, q;
		
		Object datei = openOutputFile("C:/Users/abc/Desktop/File.txt");
		
		println(datei, i);
		println(datei, i);
		println(datei, i);
		println(datei, s);
		
		closeOutputFile(datei);
		}
		String name;
		int xy;
		
		Object datei2 = openInputFile("C:/Users/abc/Desktop/File.txt");
		
		xy = readInt(datei2);
		println(xy);
		readLine(datei2);
		
		xy = readInt(datei2);
		println(xy);
		readLine(datei2);
		
		xy = readInt(datei2);
		println(xy);
		readLine(datei2);
		
		name = readLine(datei2);
		println(name);
		
		closeInputFile(datei2);
		
		
		
	}

}
