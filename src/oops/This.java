package oops;

public class This {
	int age;
	String name;
	This(int age, String name){
		age=age;
		name = name;
	}
	void display(){
		System.out.println(age+""+name);
	}
	public static void main(String args[]) {
		This th=new This(202,"Ramesh");
		This t=new This (101,"Khadka");
		th.display();
		t.display();
	}
}

