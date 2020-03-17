package exception;
import java.util.Scanner;

public class PracticeScanner {
	public static void validateAge(int age) {
		if(age<21) {
		//			throw new ArithmeticException("you can't buy cigar");
		System.out.println("you cannot buy cigar");
		}
		else System.out.println("you can buy cigar");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter your age:");
		int age=scanner.nextInt();
		validateAge(age);
		

	}

}
