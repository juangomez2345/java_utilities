package manipulandofechas;

import java.util.Date;

public class CDate {

	public static void main(String[] args) {
		Date now = new Date();
		long longtime = now.getTime();
		
		System.out.println(longtime);
		
//		Output
//		------------------------------  
//		1379111459292
		
	}
}
