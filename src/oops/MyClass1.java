package oops;

public class MyClass1 {
	int x= 20;
	
	//Create multiple objective.
	public static void main(String []args) {
		MyClass1 myobj1 = new MyClass1();// objective 1.
		MyClass1 myobj2 = new MyClass1();// objective 2.
		System.out.println(myobj1.x); // outputs 20
		System.out.println(myobj2.x); 
	}
	
}
