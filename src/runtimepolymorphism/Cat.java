package runtimepolymorphism;

public class Cat extends BabyCat{
	void eat() {
	System.out.println("Cat walk");
}
	public static void main(String[]args) {
		Animal a1=new Animal();
		Animal a2 = new BabyCat();
		Animal a3 = new Cat();
		
		a1.eat();
		a2.eat();
		a3.eat();
		
	}
}