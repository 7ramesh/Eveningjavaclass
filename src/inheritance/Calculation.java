package inheritance;

public class Calculation {
	void sum (int a, int b) {
		System.out.println(a+b);
	}
	

	void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
public static void main(String []args) {
	Calculation obj1=new Calculation();
	obj1.sum(50,40,20);
	obj1.sum(30,60);
}
	
}
