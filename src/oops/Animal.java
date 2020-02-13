package oops;

public class Animal {
	public void eat() {
		System.out.println("I am eating");
	}	
	public static void main(String[]args) {
		Animal dog = new Animal();
		dog.eat();
		dog.walk();
		
		Animal aa = new Animal(); {
			aa.eat();
			aa.walk();
	}
}
	public void walk() {
		System.out.println("I am walking");
		
	}
}
		
		