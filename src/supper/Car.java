package supper;

public class Car extends Vehicle{
	int speed = 100;
	public void displaySpeed() {
		System.out.println("Car Speed:"+ speed);
		System.out.println("Vehicle speed:"+super.speed);
		
	}
	public static void main(String []args) {
		Car car=new Car();
		car.displaySpeed();
	}
}
