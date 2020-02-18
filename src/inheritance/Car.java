package inheritance;
/* <-delete this to make your code back to normal
public class Car {
	  Car() {
		System.out.println("BMW");	
	}
	  void display() {
		 System.out.println("Printing in car");
	  }
}
class Car1 extends Car{
	void display() {
		System.out.println("Good");
	}

public static void main(String []args) {
	Car car3=new Car();
	car3.display();
	car3.displayCar1();
	
	}
}

*/    // delete this to make your code back to normal
public class Car {	//This is the class that holds the main class
	public static void main(String[] args) { //this is the main class that calls the other classes
		car2 cars = new car2();  //this is calling the "child" class  child class means the one with extends
		cars.display();	         //this is information from the parent class
		cars.display2();         //this is from the child class
	}
}
class car1 {	//this is how you make a class, it should be separate from the class with the main class
	void display() { // this is a function in this class
		System.out.println("This is car1");
	}
}
class car2 extends car1{ //this is how you make a child class
	void display2() { // this is a function in this class
		System.out.println("This is car2");
	}
}