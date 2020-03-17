package operator;

import java.util.Scanner;

import scanner.scanner;

public class example {

	public static void main(String[] args){
	int score;
	int percentage;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the total amount of score: ");
	score = sc.nextInt();
	System.out.println("Enter the score obtained: ");
	score = sc.nextInt();
	percentage = (score * 100/ score);
	System.out.println("The percentage is = " + percentage + " %");
	}

}
