package inheritance;

public class A {
	int a=20;
	void showA() {
	System.out.println("A");
	}
}
class B extends A{
	int b = 10;
	void disp() {
		System.out.println("B");
	}
	
}
class C extends B{
	int c = 15;
	void display() {
		System.out.println("C");
	}

	public static void main(String[]args){
		C obj=new C();
		obj.display();
		obj.showA();
		B obj1 = new B();
		obj1.disp();
		obj1.showA();
		
		
}

	
}