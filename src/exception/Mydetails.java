package exception;

import java.util.Scanner;

public class Mydetails {
	public static void main(String []args) {
		String s = "Hello, This is Ramesh:";
		//Create scanner object and pass string in it.
		Scanner sc=new Scanner(s);
		//Check if the scanner has a token
		System.out.println("Boolen Result:"+sc.hasNext());
		//print the string
		System.out.println("String:"+sc.nextLine());
		sc.close();
		
		System.out.println("Enter My Details......");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your name:");
		String name = scan.next();
		System.out.println("Name:"+name);
		System.out.println("Enter your Age:");
		int i= scan.nextInt();
		System.out.println("Age:"+i);
		System.out.println("Enter your Car Price");
		Float f=scan.nextFloat();
		System.out.println("Car Price:"+f);
		scan.close();
	}
	
}
