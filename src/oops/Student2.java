package oops;

public class Student2 {
	int roll;
	String name;
	Student2(int roll,String name){
		this.roll=roll;
		this.name=name;
	}
	void display() {
		System.out.println(roll+""+name);
	}
	public static void main(String[]args) {
		Student2 student = new Student2(21, "Ramesh");
		
		Student2 ss=new Student2(55, "Ram");
		student.display();
		ss.display();
	}
}

