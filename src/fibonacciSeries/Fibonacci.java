package fibonacciSeries;

public class Fibonacci {
	public static void main(String args[]) {//Swapping concept 
		int a= 1, b=2; 
	System.out.println(a+" "+b);
		int c;
		for(int i=1; i<=15; i++) {
			c=a+b;
			System.out.print("  "+c);
			a=b;
			b=c;
			
			
		}
		
	}
}