package oops;

public class Student1 {
	String name;
	int age;
	
	void canRead() {
		System.out.println("this is canRead method");
	}
	void displayStudentDetails(Student1 student1) {
		System.out.println("The name is:" +student1.name +" Age is "+student1.age);
	}

	public static void main(String[]args) {
		Student1 student = new Student1();//instantiate object of class type Student
		student.canRead();// calling method
		student.name= "Ramesh";
		student.age = 40;
		student.displayStudentDetails(student);
}
}