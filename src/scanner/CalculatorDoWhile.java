package scanner;

import java.util.Scanner;

public class CalculatorDoWhile {

	public static void main(String[] args) {
		String yn;
		do 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter First No.");
			int no1 = sc.nextInt();
			System.out.println("Enter Second No.");
			int no2 = sc.nextInt();
			System.out.println("Select Symbol(+,-,/,*)");
			String symbol=sc.next();
			int result;
			switch(symbol) {
				case"+":result=no1+no2;
					System.out.println("Addition is:"+result);
					break;
				case"-": result=no1-no2;
					System.out.println("Subtraction is:"+result);
					break;
				case"/": result=no1/no2;
					System.out.println("Division is:"+result);
					break;
				case "*":result=no1*no2;
					System.out.println("Multiplication is:"+result);
					break;
			default:System.out.println("invalid Symbol");
				break;
			}
			System.out.println("Do you want to continue(Press y for Yes and n for No)");
				yn=sc.next();
		}while(yn.equals("y")||yn.equals("Y"));	

	}

}
