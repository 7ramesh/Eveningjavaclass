package oops;

public class Person {
	String firstname = "Ramesh";
	String lastname = "Khadka";
	int age = 40;
	
	//Multiple Attributes.
	public static void main(String[]args) {
		Person myobj = new Person();
		System.out.println("First name is:" + myobj.firstname + " " + myobj.lastname);
		System.out.println("Age:" + myobj.age);
}
}