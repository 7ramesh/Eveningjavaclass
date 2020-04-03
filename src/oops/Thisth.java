package oops;

public class Thisth {
	String name;
	int age;
	Thisth(String n, int a){
		name=n;
		age=a;
	}
	void display(){
		System.out.println(name+"" +age);
		
	}
	public static void main(String args[]) {
		Thisth th = new Thisth("Ramesh", 41);
		Thisth t= new Thisth("Pramila",36);
		th.display();
		t.display();
	}

}
