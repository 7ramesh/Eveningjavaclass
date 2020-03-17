package homework;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Array");
		int length = sc.nextInt();
		int[]myArray=new int[length];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<length; i++) {
			myArray[i]= sc.nextInt();}
		
			System.out.println(Arrays.toString(myArray));
			
			
		}

	}


