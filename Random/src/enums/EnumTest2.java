package enums;
import static gdi.MakeItSimple.*;

public class EnumTest2 {

	String name;
	EnumTest person;

	EnumTest2 (String name, EnumTest person){
		this.name = name;
		this.person = person;
		}
	
	public void ausgabeEnumTest2(){
		String info = name + " ist ein(e) " + person;
		System.out.println(info);
	}

	public static void main(String[] args) {

		EnumTest2 peter = new EnumTest2("Peter", EnumTest.MANN);
		peter.ausgabeEnumTest2();

		// WIE KANN MAN ES SCHÖNE BESSER GESTALTEN?







	}

}
