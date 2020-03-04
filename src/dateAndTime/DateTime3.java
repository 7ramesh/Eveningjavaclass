package dateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime3 {
	public static void main(String[]args) {
		Date date= new Date();
		SimpleDateFormat ft= new SimpleDateFormat("E yyyy.mm.dd 'at' hh:mm:ss a zzz");
		System.out.println("Current Date:"+ft.format(date));
		
	}

}
