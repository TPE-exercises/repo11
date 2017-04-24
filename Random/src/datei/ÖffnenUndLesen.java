package datei;

import static gdi.MakeItSimple.*;

public class ÖffnenUndLesen {

	public static void main(String[] args) {
		
		String name;
		int xy;
		
		
		Object file = openInputFile("C:/Users/abc/Desktop/File.txt");
		
		
		name = readLine(file);
		System.out.println(name);
		
		
		name = readLine(file);
		System.out.println(name);
		
		xy = readInt(file);
		System.out.print(xy + " ");
		
		xy = readInt(file);
		System.out.print(xy + " ");
		
		xy = readInt(file);
		System.out.print(xy);
		
		name = readLine(file);
		System.out.println(name);
		
		name = readLine(file);
		System.out.println(name);
		
		name =readLine(file);
		System.out.println(name);
		
		
		
		
		 // wichtig
		closeInputFile(file);
		
	}
	
}
		
		
		
		
