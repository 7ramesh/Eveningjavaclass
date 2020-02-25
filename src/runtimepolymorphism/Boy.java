package runtimepolymorphism;

public class Boy extends Human {
	void walk() {
		System.out.println("Boy can walk");
	}
	public static void main(String []args) {
		Human h = new Human();
		h.walk();// Static banding
		
		Boy b = new Boy();// Static banding
		b.walk();
		
		Human hb= new Boy(); //Dynamic binding
		hb.walk();
		
	}
}
