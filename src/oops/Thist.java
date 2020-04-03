package oops;

public class Thist {
	String name;
	int age;
	Thist(int age, String name){
		this.age=age;
		this.name=name;
		System.out.println(age+""+name);
	}
	void display() {
	}
	public static void main(String arg[]) {
		Thist th=new Thist(102, "Ramesh");
		Thist t=new Thist(202, "Khadka");
		th.display();
		t.display();
	}
}
	
