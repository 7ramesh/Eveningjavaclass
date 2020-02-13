package switchexample;

public class bullOnOff {
	public static void main(String []args) {
		int value=1;
		switch(value){
			case 1:
//			statement
			System.out.println("Light is turned On");
			break;
			case 0:
//			statement
				System.out.println("Light is turned Off");
			break;
			default:
//				statement
				System.out.println("Invalid inpit");
		}
		int day = 5;
		String dayString;{
			switch (day) {
			case 1:
				dayString = "Monday";
				break;
			case 2:
				dayString = "Tuesday";
				break;
			case 3 :
				dayString = "Wednesday";
				break;
			case 4 :
				dayString = "Thursday";
				break;
			case 5 :
				dayString = "Friday";
				break;
			case 6 :
				dayString = "Saturday";
				break;
			case 7 :
				dayString = "Sunday";
				break;
				default: 
				dayString = "invalid day";
				break;
			}
			System.out.println(dayString);
				
			}
		
		
		int month = 3;
		switch (month) {
		case 1:
			System.out.println("January");
		break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		}
	
			
		int months = 3;
		switch (months){
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
			
				
			}
		int fruit = 2;
		switch (fruit) {
		case 1:
			System.out.println("Mango");
			break;
		case 2:
			System.out.println("Apple");
			break;
		case 3:
			System.out.println("Rasberry");
			break;
		case 4:
			System.out.println("Orange");
			break;
		case 5:
			System.out.println("Banana");
			break;
		
		}
	}
	}

			
		
			
		



