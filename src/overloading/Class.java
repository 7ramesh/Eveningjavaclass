package overloading;

public class Class { // Method Overloading
	void display() {
		System.out.println("Display");
	}
	void display(int a) {
		System.out.println("a="+a);
	}

public static void main(String []args) {
	Class obj = new Class();
	obj.display();
	obj.display(10);
		
}
}