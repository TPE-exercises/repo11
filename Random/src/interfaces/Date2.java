package interfaces;

import gdi.MakeItSimple.*;

public class Date2 implements Date{



	int tag, monat, jahr;

	Date2(int tag, int monat, int jahr){
		this.tag = tag;
		this.monat = monat;
		this.jahr = jahr;


	}

	void array( int [] array){

	}


	@Override
	public int getDay() {

		return tag;
	}

	@Override
	public int getMonth() {

		return monat;
	}

	@Override
	public int getYear() {

		return jahr;
	}

	@Override
	public boolean equals(Date obj) {  
		if(getDay()>=obj.getDay() )
			return true;

		return false;
	}

	@Override
	public boolean laterThan(Date d2) {

		if(getDay() <= d2.getDay() && getMonth() <= d2.getMonth() && getYear() <=d2.getYear()){
			return true;

		}
		return false;
	}

	@Override
	public Date add(int numberOfDays) {

		return null;
	}

	@Override
	public int differenceInDays(Date d2) {

		return 0;
	}

	public String toString(){

		String datumAusgabe = tag + "." + monat + "." + jahr;

		return datumAusgabe;
	}

}








