package overloading;

public class ClassA { //Operator overloading addition/ concatenation
	void add() {
		int a = 10, b= 20;
		int c= a+b;
		System.out.println("Sum="+c);
	}
	void add (int x, int y) {
		int z=x+y;
		System.out.println("Sum="+z);
		
	}

	public static void main(String []args) {
		ClassA obj = new ClassA();
		obj.add();
		obj.add(40,50);
	}
}
