package inheritance;

public class Person {
	class person{
		int age;
		void displayB() {
			System.out.println("This is from person");
		}
	}
	
	public class student extends person{
		String name;
	void display() {
		System.out.println("This is from class student");
			}
	}
	
	void displayResult("the name is"+name+"and age:"+age);
	
	
	public static void main(String[]args) {
		Person p=new Person();
		p.displayperson();
		p.displaystudent();
		
		
		
	}
}
