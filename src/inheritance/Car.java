package inheritance;

public class Car {
	  Car() {
		System.out.println("BMW");	
	}
}
class toyota extends Car{
	void showcamry() {
		System.out.println("Good");
	}

public static void main(String []args) {
	Car car1=new Car();
	car1.showCar();
	car1.showcamry();
	
	}
}