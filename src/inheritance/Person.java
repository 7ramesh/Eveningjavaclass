package inheritance;
/*  <-delete this to make your code back to normal
public class Person {
	public class parent{
		int age = 30;
		void displayPerson() {
			System.out.println("This is from person");
		}
	}
	
	public class student extends parent{
		String name = "Dan";
	void displayStudent() {
		System.out.println("This is from class student");
			}
	}
	
	void displayResult(String name, int age) {
		System.out.println("the name is"+name+"and age:"+age);
	}
	
	public static void main(String[]args) {
		studnet p = new parent();
		p.displayPerson();
		p.displayStudent();
		
		
		
	}
}
*/  // delete this to make your code back to normal
public class Person{ //this class holds the main function and the displayResult function
	static void displayResult(String name, int age) { //this is a function in the main class. it must have "static" infront to call it
		System.out.println("the name is "+name+" and age: "+age);
	}
	public static void main(String[]args) {
		student p = new student();  //this is making a student class in memory
		p.displayParent();          //this is calling the parent through the student
		p.displayStudent();         //this is calling the student through student
		int age = p.age;            //this is getting the age from parent through student
		String name = p.name;       //this is getting the name from student
		displayResult(name,age); // this is calling displayResult by giving name and age
		
		
		
	}
}
class parent{  // this is the parent class it has nothing from student
	//this class must be outside of your main class
	//do not put public on parent because the class above it, the main class, already has public in it
	int age = 30; 
	void displayParent() { 
		System.out.println("This is from person");
	}
}
class student extends parent{ // this is student class, it has whatever the parent class has
	String name = "Dan";
	void displayStudent() {
		System.out.println("This is from class student");
		}
}
