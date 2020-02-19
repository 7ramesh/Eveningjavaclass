package inheritance;

public class A {
	int a=20;
	void showA() {
	System.out.println("RK");
	}
}
class B extends A{
	int b = 10;
	void disp() {
		System.out.println("Ramesh");
	}
	
}
class C extends B{
	int c = 15;
	void display() {
		System.out.println("khadka");
	}

	public static void main(String[]args){
		C obj=new C();
		obj.display();
		obj.showA();
		//B obj1 = new B();
		obj.disp();
		//obj1.showA();
		
		
}

	
}