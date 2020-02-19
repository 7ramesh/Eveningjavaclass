package overloading;

public class Calculation1 {//overloading method
	void sum(int a,long b,float c) {
		System.out.println(a+b+c);
}
	void sum(int a, int b, int c, int d) {
		System.out.println(a*b*c*d);
}
	public static void main(String[]args) {
		Calculation1 obj=new Calculation1();
		obj.sum(2, 3, 4,5);
		obj.sum(5, 6, 7);
	}
}
