package genericMethod;
import java.util.Scanner;

public class RuntimeException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter first number:");
		int a = scanner.nextInt();
		System.out.println("enter second number:");
		int b = scanner.nextInt();
		try {
		int result=a/b;
		System.out.println("the division of " +a+"and"+b+"is:"+result);
		
	}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("this is after exception");
	}
}
