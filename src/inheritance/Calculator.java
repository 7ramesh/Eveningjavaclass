package inheritance;

public class Calculator { //method overloading by changing data type of args.
	void sum (int a, int b) {
		System.out.println(a+b);
	}

void sum(double a, double b) {
	System.out.println(a+b);
}
public static void main(String []args) {
	Calculator cal1=new Calculator();
	cal1.sum(10.5,20.5);
	cal1.sum(20, 20);
}
}
