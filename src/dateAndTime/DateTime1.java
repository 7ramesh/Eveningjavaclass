package dateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime1 {

	public static void main(String[] args) {
		LocalDateTime myDateobj=LocalDateTime.now();
		System.out.println("Befoe Formatting: "+myDateobj);
		DateTimeFormatter myFormatobj=DateTimeFormatter.ofPattern("E,MMM dd yyyy  HH:mm:ss");
		

		String formatteDate = myDateobj.format(myFormatobj);
		System.out.println("After Formatting: "+ formatteDate);
		
		
		 
	   
	    
	    
	}

}
