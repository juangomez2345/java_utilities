package manipulandofechas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CSimpleDateFormat {
	
	public static void main(String[] args)throws Exception {
		Date now = new Date();
		String string = now.toString();
		System.out.println(string);
		
		//now.setTime(1379111459292L);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
		System.out.println(simpleDateFormat.format(now));
		
//		Output
//		------------------------------	
//		Fri Sep 13 17:40:15 CDT 2013
//		vie 09 13 17:40:15
	}
	
}

/*
 
Símbolo		Significado						Ejemplo
G			Era				    			GG -> AD
y			Year							yy -> 03?
											yyyy -> 2003?
M			Month							M -> 7?
											M -> 12?
											MM -> 07?
											MMM -> Jul
											MMMM -> December
d			Day in month					d -> 3?
											dd -> 03?
h			Hour(1-12, AM/PM)				h -> 3?
											hh -> 03?
H			Hour(0-23)						H -> 15?
											HH -> 15?
k			Hour(1-24)						k -> 3?
											kk -> 03?
K			Hour(0-11 AM/PM)				K -> 15?
											KK -> 15?
m			Minute							m -> 7?
											m -> 15?
											mm -> 15?
s			Second							s -> 15?
											ss -> 15?
S			Millisecond (0-999)				SSS -> 007?
E			Day in week						EEE -> Tue
											EEEE -> Tuesday
D			Day in year (1-365 or 1-364)	D -> 65?
											DDD -> 065?
F			Day of week in month (1-5)		F -> 1?
w			Week in year (1-53)				w -> 7?
W			Week in month (1-5)				W -> 3?
a			AM/PM							a -> AM
											aa -> AM
z			Time zone						z -> EST
											zzz -> EST
											zzzz -> Eastern Standard Time
‘			Excape for 						‘hour’ h -> hour 9?
			Single quote					ssSSS -> 45’876?
Symbol		Meaning	Type					Example
G			Era								GG -> AD
y			Year							yy -> 03?
											yyyy -> 2003?
M			Month							M -> 7?
											M -> 12?
											MM -> 07?
											MMM -> Jul
											MMMM -> December
d			Day in month					d -> 3?
											dd -> 03?
h			Hour (1-12, AM/PM)				h -> 3?
											hh -> 03?
H			Hour (0-23)						H -> 15?
											HH -> 15?
k			Hour (1-24)						k -> 3?
											kk -> 03?
K			Hour (0-11 AM/PM)				K -> 15?
											KK -> 15?
m			Minute							m -> 7?
											m -> 15?
											mm -> 15?
s			Second							s -> 15?
											ss -> 15?
S			Millisecond (0-999)				SSS -> 007?
E			Day in week						EEE -> Tue
											EEEE -> Tuesday
D			Day in year (1-365 or 1-364)	D -> 65?
											DDD -> 065?
F			Day of week in month (1-5)		F -> 1?
w			Week in year (1-53)				w -> 7?
W			Week in month (1-5)				W -> 3?
a			AM/PM							a -> AM
											aa -> AM
z			Time zone						z -> EST
											zzz -> EST
											zzzz -> Eastern Standard Time
‘			Excape for 						‘hour’ h -> hour 9?
			Single quote					ssSSS -> 45’876?	
*/
	

