package oops;

public class StaticVariable {
	
	int color;
	String fruit;
	static String collage = "KU";
	
	StaticVariable(int col, String f){
		color=col;
		fruit = f;
		
	}
	void display() {
		System.out.println(color+""+fruit +""+collage+"\n");
	}
	static void main(String[]args) {
		StaticVariable r1 = new StaticVariable(111,"Ramesh");
		StaticVariable p2 = new StaticVariable(222, "Pramila");
		
		r1.display();
		p2.display();
		
	}
}

