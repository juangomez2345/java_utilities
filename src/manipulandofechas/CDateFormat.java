package manipulandofechas;

import java.util.Date;
import java.text.DateFormat;


public class CDateFormat {

	public static void main(String[] args) {
		DateFormat();
	}
	
	public static void DateFormat(){
		Date now = new Date();
		
		DateFormat dateformat01 =  DateFormat.getDateInstance();
		DateFormat dateformat02 = DateFormat.getDateInstance(DateFormat.SHORT);
		DateFormat dateformat03 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		DateFormat dateformat04 = DateFormat.getDateInstance(DateFormat.LONG);
		DateFormat dateformat05 = DateFormat.getDateInstance(DateFormat.FULL);
		
		String string01 = dateformat01.format(now);
		String string02 = dateformat02.format(now);
		String string03 = dateformat03.format(now);
		String string04 = dateformat04.format(now);
		String string05 = dateformat05.format(now);
		
		System.out.println("Default :" + string01);
		System.out.println("SHORT   :" + string02);
		System.out.println("MEDIUM  :" + string03);
		System.out.println("LONG    :" + string04);
		System.out.println("FULL    :" + string05);
		
//		Output
//		------------------------------		
//		Default :13/09/2013
//		SHORT   :13/09/13
//		MEDIUM  :13/09/2013
//		LONG    :13 de septiembre de 2013
//		FULL    :viernes 13 de septiembre de 2013
		
	}
	
	
}
