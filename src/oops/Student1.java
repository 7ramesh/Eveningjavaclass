package oops;

public class Student1 {
	String name;
	int age;
	
	void canRead() {
		System.out.println("this is canRead method");
	}
	void displayStudentDetails(student student) {
		System.out.println("The name is:"+student.name +"Age is :"+student.age);
	}

	public static void main(String[]args) {
		student student = new student();//instantiate object of class type Student
		student.canRead();// calling method
		student.name="Ramesh";
		student.age = 40;
		student.displayStudentDetails(student);
}
