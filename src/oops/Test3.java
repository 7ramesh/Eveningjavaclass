package oops;

public class Test3 {
	int age;
	String name;
	
	Test3(int age, String name){
		this.age = age;
		this.name = name;
	}
	public static void main(String[]args) {
		Test3 test = new Test3(20,"Ramesh");
		Test3 test1 = new Test3 (25,"RK");
		
		System.out.println("Age is:"+test.age + "Name is:"+test.name);
		System.out.println("Age is:"+test1.age + "Name is:"+test1.name);
	}
}
