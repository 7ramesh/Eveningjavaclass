package dateAndTime;

import java.util.Date;

public class DateTime4 {
	public static void main(String[]args) {
		Date date = new Date();
		System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date : ", date);
	}

}
