package fibonacciSeries;

public class Fabonacci1 {
	static int x1=0,x2=1,x3=0;
	static void printFibonacci(int count) {
		if(count>0) {
			x3=x1+x2;
			x1=x2;
			x2=x1;
			System.out.print(" "+x3);
			printFibonacci(count-1);
		}
	}
	public static void main(String []args) {
		int count = 10;
		System.out.print(x1+ " " +x2);
		printFibonacci(count-2);
	}
}
