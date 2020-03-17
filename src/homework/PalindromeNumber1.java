package homework;

import java.util.Scanner;

public class PalindromeNumber1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = 161;
		int temp=a;
		int rev=0,rem;
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		if(a==rev) {
			System.out.println(a+" is palindrome number");
		}
		else {
			System.out.println(a+ " is not a palindrome number");
		}

	}



	}


